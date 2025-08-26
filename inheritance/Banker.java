package inheritance;

import java.util.Scanner;

class bankAccount {
    String name;
    String accountNumber;
    String accountType;
    double balance;

    final double ROI = 10;
    final double MIN_BALANCE = 1000.0;

    public bankAccount(String name, String accountNumber, String accountType, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited , New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println(amount + " withdrawn , New balance: " + balance);
        } else {
            System.out.println("Withdrawal Denied");
        }
    }

    public void display() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}


class savingsAccount extends bankAccount {

    public savingsAccount(String name, String accountNumber, String accountType, double balance) {
        super(name, accountNumber, accountType, balance);
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= 100) {
            balance -= amount;
            System.out.println(amount + " withdrawn from savings account , New balance: " + balance);
        } else {
            System.out.println("Withdrawal denied , Balance cannot fall below 100/-");
        }
    }
}

public class Banker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter account number: ");
        String accNum = input.nextLine();

        System.out.print("Enter account type: ");
        String accType = input.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = input.nextDouble();

        savingsAccount sa = new savingsAccount(name, accNum, accType, balance);

         int choice;
        do {
            System.out.println("\nChoose an operation:\n");
            System.out.println("1. Deposit Amount");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Display Account Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmt = input.nextDouble();
                    sa.deposit(depositAmt);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmt = input.nextDouble();
                    sa.withdraw(withdrawAmt);
                    break;

                case 3:
                    sa.display();
                    break;

                case 4:
                	break;
                	
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        input.close();
    }
}
