import java.util.Scanner;

class ArrayUtils {
    public static <T> void swap(T[] array, int i, int j) {
        if (array == null || i < 0 || j < 0 || i >= array.length || j >= array.length) {
            throw new IllegalArgumentException("Invalid indices or null array");
        }
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static <T> void printArray(T[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

public class Exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array type (string/integer): ");
        String type = scanner.nextLine().trim().toLowerCase();

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // consume newline

        if (type.equals("string")) {
            String[] array = new String[size];
            System.out.println("Enter " + size + " string elements:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextLine();
            }

            System.out.print("Enter first index to swap: ");
            int i = scanner.nextInt();
            System.out.print("Enter second index to swap: ");
            int j = scanner.nextInt();

            ArrayUtils.swap(array, i, j);
            System.out.print("Swapped array: ");
            ArrayUtils.printArray(array);

        } else if (type.equals("integer")) {
            Integer[] array = new Integer[size];
            System.out.println("Enter " + size + " integer elements:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.print("Enter first index to swap: ");
            int i = scanner.nextInt();
            System.out.print("Enter second index to swap: ");
            int j = scanner.nextInt();

            ArrayUtils.swap(array, i, j);
            System.out.print("Swapped array: ");
            ArrayUtils.printArray(array);

        } else {
            System.out.println("Unsupported type.");
        }

        scanner.close();
    }
}
