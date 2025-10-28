import java.util.Scanner;

public class ArrayPrinter {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of integers: ");
        int intSize = scanner.nextInt();
        Integer[] intArray = new Integer[intSize];
        System.out.println("Enter " + intSize + " integers:");
        for (int i = 0; i < intSize; i++) {
            intArray[i] = scanner.nextInt();
        }
        System.out.print("Integer Array: ");
        printArray(intArray);

        System.out.print("Enter number of doubles: ");
        int doubleSize = scanner.nextInt();
        Double[] doubleArray = new Double[doubleSize];
        System.out.println("Enter " + doubleSize + " double values:");
        for (int i = 0; i < doubleSize; i++) {
            doubleArray[i] = scanner.nextDouble();
        }
        System.out.print("Double Array: ");
        printArray(doubleArray);

        scanner.nextLine();
        System.out.print("Enter number of strings: ");
        int stringSize = scanner.nextInt();
        scanner.nextLine();
        String[] stringArray = new String[stringSize];
        System.out.println("Enter " + stringSize + " strings:");
        for (int i = 0; i < stringSize; i++) {
            stringArray[i] = scanner.nextLine();
        }
        System.out.print("String Array: ");
        printArray(stringArray);

        scanner.close();
    }
}
