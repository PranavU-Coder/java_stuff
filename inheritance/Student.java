package inheritance;

import java.util.Scanner;

class Person {
    private String name;
    private String birthDate;
    
    public Person(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    
    String getName() {
        return name;
    }
    
    void setName(String name) {
        this.name = name;
    }
    
    String getBirthDate() {
        return birthDate;
    }
    
    void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}

class CollegeGrad extends Person {
    private double gpa;
    private int graduationYear;
    
    public CollegeGrad(String name, String birthDate, double gpa, int graduationYear) {
        super(name, birthDate); 
        this.gpa = gpa;
        this.graduationYear = graduationYear;
    }
    
    double getGpa() {
        return gpa;
    }
    
    void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    int getGraduationYear() {
        return graduationYear;
    }
    
    void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }
}

public class Student {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter student name: ");
        String name = input.nextLine();
        
        System.out.print("Enter birth date: ");
        String birthDate = input.nextLine();
        
        System.out.print("Enter GPA: ");
        double gpa = input.nextDouble();
        
        System.out.print("Enter graduation year: ");
        int gradYear = input.nextInt();
        
        CollegeGrad student = new CollegeGrad(name, birthDate, gpa, gradYear);
        
        System.out.println("\nStudent Information:\n");
        System.out.println("Name: " + student.getName());
        System.out.println("Birth Date: " + student.getBirthDate());
        System.out.println("GPA: " + student.getGpa());
        System.out.println("Graduation Year: " + student.getGraduationYear());
        
        input.close();
    }
}
