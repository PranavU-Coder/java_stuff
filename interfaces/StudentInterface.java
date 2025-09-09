package interfaces;

import java.util.Scanner;

class Student {

    int rollNumber;
    int[] marks;

    public void getNumber(Scanner input) {
        System.out.print("Enter roll number: ");
        rollNumber = input.nextInt();
    }

    public void putNumber() {
        System.out.println("Roll Number: " + rollNumber);
    }

    public void getMarks(Scanner input) {
        System.out.print("Enter number of subjects: ");
        int numSubjects = input.nextInt();
        marks = new int[numSubjects];

        System.out.println("Enter marks for " + numSubjects + " subjects:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = input.nextInt();
        }
    }

    public void putMarks() {
        System.out.println("Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
    }
}

interface Sports {
    void putGrade();
}

class Result extends Student implements Sports {

    String grade;

    public void getGrade(Scanner input) {
        System.out.print("Enter sports grade : ");
        grade = input.next();
    }

    public void putGrade() {
        System.out.println("Sports Grade: " + grade);
    }

    public void displayFinalResult() {
        putNumber();
        putMarks();
        putGrade();

        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        double average = total / (double) marks.length;

        System.out.println("Average Marks: " + average);
        System.out.println("Final Result: " + (average >= 40 && !grade.equalsIgnoreCase("C") ? "PASS" : "FAIL"));
    }
}

public class StudentInterface{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Result student = new Result();
        student.getNumber(input);
        student.getMarks(input);
        student.getGrade(input);

        System.out.println("\n--- Final Result ---");
        student.displayFinalResult();
        
        input.close();
    }
}
