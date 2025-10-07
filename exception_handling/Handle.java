package exception_handling;

import java.util.Scanner;

class PushException extends Exception {
    public PushException(String message) {
        super(message);
    }
}

class PopException extends Exception {
    public PopException(String message) {
        super(message);
    }
}

class Stack {
    int[] stackArray;
    int top;
    int capacity;

    public Stack(int size) {
        capacity = size;
        stackArray = new int[capacity];
        top = -1;
    }

    public void push(int value) throws PushException {
        if (top == capacity - 1) {
            throw new PushException("Stack Overflow" + value);
        }
        stackArray[++top] = value;
    }

    public int pop() throws PopException {
        if (top == -1) {
            throw new PopException("Stack Underflow");
        }
        return stackArray[top--];
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack contents: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}

public class Handle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = scanner.nextInt();
        Stack stack = new Stack(size);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = scanner.nextInt();
                    try {
                        stack.push(value);
                        System.out.println("Pushed " + value);
                    } catch (PushException e) {
                        System.out.println("Push Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        int popped = stack.pop();
                        System.out.println("Popped: " + popped);
                    } catch (PopException e) {
                        System.out.println("Pop Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    stack.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
