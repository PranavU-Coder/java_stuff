import java.util.Scanner;

class Student {
    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return "Student{name='" + name + "', id=" + id + "}";
    }
}

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return "Employee{name='" + name + "', department='" + department + "'}";
    }
}

class Stack<T> {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    public Stack() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void push(T value) {
        if (size == elements.length) {
            throw new RuntimeException("Stack overflow");
        }
        elements[size++] = value;
    }

    public T pop() {
        if (size == 0) {
            throw new RuntimeException("Stack underflow");
        }
        T value = (T) elements[--size];
        elements[size] = null;
        return value;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

public class GenericStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Student> studentStack = new Stack<>();
        System.out.print("Enter number of students to push: ");
        int studentCount = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < studentCount; i++) {
            System.out.println("Enter name of student " + (i + 1) + ":");
            String name = scanner.nextLine();
            System.out.println("Enter ID of student " + (i + 1) + ":");
            int id = scanner.nextInt();
            scanner.nextLine(); 
            studentStack.push(new Student(name, id));
        }

        System.out.print("How many students to pop? ");
        int studentPop = scanner.nextInt();
        System.out.println("Popped from Student stack:");
        for (int i = 0; i < studentPop; i++) {
            if (!studentStack.isEmpty()) {
                System.out.println(studentStack.pop());
            } else {
                System.out.println("Stack is empty.");
                break;
            }
        }

        Stack<Employee> employeeStack = new Stack<>();
        System.out.print("\nEnter number of employees to push: ");
        int employeeCount = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < employeeCount; i++) {
            System.out.println("Enter name of employee " + (i + 1) + ":");
            String name = scanner.nextLine();
            System.out.println("Enter department of employee " + (i + 1) + ":");
            String department = scanner.nextLine();
            employeeStack.push(new Employee(name, department));
        }

        System.out.print("How many employees to pop? ");
        int employeePop = scanner.nextInt();
        System.out.println("Popped from Employee stack:");
        for (int i = 0; i < employeePop; i++) {
            if (!employeeStack.isEmpty()) {
                System.out.println(employeeStack.pop());
            } else {
                System.out.println("Stack is empty.");
                break;
            }
        }

        scanner.close();
    }
}
