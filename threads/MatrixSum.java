import java.util.Scanner;

class RowSumTask implements Runnable {
    int[] row;
    int rowIndex;
    int[] partialSums;

    public RowSumTask(int[] row, int rowIndex, int[] partialSums) {
        this.row = row;
        this.rowIndex = rowIndex;
        this.partialSums = partialSums;
    }

    public void run() {
        int sum = 0;
        for (int num : row) {
            sum += num;
        }
        partialSums[rowIndex] = sum;
        System.out.println("Row " + rowIndex + " sum: " + sum);
    }
}

public class MatrixSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int numRows = input.nextInt();

        System.out.print("Enter number of columns: ");
        int numCols = input.nextInt();

        int[][] matrix = new int[numRows][numCols];
        System.out.println("Enter matrix elements row by row:");

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        int[] partialSums = new int[numRows];
        Thread[] threads = new Thread[numRows];

        for (int i = 0; i < numRows; i++) {
            threads[i] = new Thread(new RowSumTask(matrix[i], i, partialSums));
            threads[i].start();
        }

        for (int i = 0; i < numRows; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e);
            }
        }

        int totalSum = 0;
        for (int sum : partialSums) {
            totalSum += sum;
        }

        System.out.println("Total matrix sum: " + totalSum);
        input.close();
    }
}
