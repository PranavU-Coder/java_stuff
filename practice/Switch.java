package practice;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int result = number * number;

        switch (result / 10) {
            case 0:
                System.out.println(result + " is between 0 and 9");
                break;
            case 1:
                System.out.println(result + " is between 10 and 19");
                break;
            case 2:
                System.out.println(result + " is between 20 and 29");
                break;
            default:
                System.out.println(result + " is 30 or greater");
                break;
        }

        input.close();
    }
}