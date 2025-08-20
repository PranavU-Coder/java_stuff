package practice;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        
        float radius;
        float pi = 3.14159f;

        Scanner input = new Scanner(System.in);

        System.out.println("enter radius of circle :");
        radius = input.nextFloat();
        float area = pi * radius * radius;

        System.out.println("area of circle is : " + area);
        input.close();
    }
}
