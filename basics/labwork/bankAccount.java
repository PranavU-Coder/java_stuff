package pranav_ecm_b;

import java.util.Scanner;

class BankAccount {
    private String name;
    private String accountNumber;
    private String accountType;
    private double balance;

    private static final double ROI = 10; 
    private static final double MIN_BALANCE = 1000.0;

    public BankAccount(String name, String accountNumber, String accountType, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Withdrawal failed.");
        }
    }

    public void displayDetails() {
        System.out.println("Account Details:");
        System.out.println("Name           : " + name);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : " + balance);
    }

    public static void displayRateOfInterest() {
        System.out.println("\nRate of Interest: " + ROI + "%");
    }
}

public class bankAccount {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name of depositor: ");
        String name = input.nextLine();

        System.out.print("Enter account number: ");
        String accNo = input.nextLine();

        System.out.print("Enter type of account: ");
        String accType = input.nextLine();

        System.out.print("Enter balance amount: ");
        double balance = input.nextDouble();

        BankAccount account = new BankAccount(name, accNo, accType, balance);

        int choice;
        do {
            System.out.println("\nChoose an operation:\n");
            System.out.println("1. Deposit Amount");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Display Account Details");
            System.out.println("4. Display Rate of Interest");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmt = input.nextDouble();
                    account.deposit(depositAmt);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmt = input.nextDouble();
                    account.withdraw(withdrawAmt);
                    break;

                case 3:
                    account.displayDetails();
                    break;

                case 4:
                    BankAccount.displayRateOfInterest();
                    break;
                    
                case 5:
                	break;
                	
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

    }
}
