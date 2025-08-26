package inheritance;

import java.util.Scanner;

class Human {

    String Firstname;
    String Lastname;

    Human(String Firstname, String Lastname) {
        this.Firstname = Firstname;
        this.Lastname = Lastname;
    }
    
    String getFirstName() {
        return Firstname;
    }
    
    void setFirstName(String Firstname) {
        this.Firstname = Firstname;
    }
    
    String getLastName() {
        return Lastname;
    }
    
    void setLastName(String Lastname) {
        this.Lastname = Lastname;
    }
}


class Employee extends Human {

    private String employeeId;
    private String jobTitle;

    Employee(String Firstname, String Lastname, String employeeId, String jobTitle) {
        super(Firstname, Lastname);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    String getEmployeeId() {
        return employeeId;
    }

    void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    String getJobTitle() {
        return jobTitle;
    }

    void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    String getLastName() {
        return super.getLastName() + " (" + jobTitle + ")";
    }
}


public class Employer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Enter Employee ID: ");
        String employeeId = input.nextLine();

        System.out.print("Enter Job Title: ");
        String jobTitle = input.nextLine();

        Employee emp = new Employee(firstName, lastName, employeeId, jobTitle);

        System.out.println("\nEmployee Details:");
        System.out.println("First Name: " + emp.getFirstName());
        System.out.println("Last Name: " + emp.getLastName()); 
        System.out.println("Employee ID: " + emp.getEmployeeId());

        input.close();
    }
}
