package practice;

import java.util.Scanner;

public class Light {
    public static void main(String[] args){
        int lightspeed;
        long days;
        long seconds;
        long distance;

        // approx speed in miles per hour

        Scanner input = new Scanner(System.in);

        lightspeed = 1086000;
        System.out.println("Enter number of days :");
        days = input.nextLong();
        seconds = days * 24 * 3600;
        distance = lightspeed * seconds;
        
        System.out.println("in " + days + " days");
        System.out.println("light would have covered " + distance + " miles");

        input.close();
    }
}
