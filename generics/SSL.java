import java.util.Scanner;

class GenericList<T> {
    private Node<T> head;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class SSL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GenericList<Integer> intList = new GenericList<>();
        System.out.print("Enter number of integers to add: ");
        int intCount = scanner.nextInt();
        System.out.println("Enter " + intCount + " integers:");
        for (int i = 0; i < intCount; i++) {
            intList.add(scanner.nextInt());
        }
        System.out.print("Integer List: ");
        intList.printList();

        GenericList<Double> doubleList = new GenericList<>();
        System.out.print("Enter number of doubles to add: ");
        int doubleCount = scanner.nextInt();
        System.out.println("Enter " + doubleCount + " double values:");
        for (int i = 0; i < doubleCount; i++) {
            doubleList.add(scanner.nextDouble());
        }
        System.out.print("Double List: ");
        doubleList.printList();

        scanner.close();
    }
}
