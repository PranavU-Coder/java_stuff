package practice;

import java.util.Scanner;
public class FindPrime {
    public static void main(String[] args){

        int number;

        Scanner input = new Scanner(System.in);
        System.out.print("enter a number : ");
        number = input.nextInt();

        int i = 2;
        

        while(i<number){
            if(number%i==0){
                break;
            }
            i++;
        }

        if(i==number){
            System.out.println(number + " is Prime ");
        } else 
        System.out.println(number + " is not prime");

        input.close();
    }
}
