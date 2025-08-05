package pranav_ecm_b;

import java.util.Scanner;

public class time {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first time (hh mm ss):");
        int h1 = input.nextInt();
        int m1 = input.nextInt();
        int s1 = input.nextInt();
        timeHelper t1 = new timeHelper(h1, m1, s1);

        System.out.println("Enter second time (hh mm ss):");
        int h2 = input.nextInt();
        int m2 = input.nextInt();
        int s2 = input.nextInt();
        timeHelper t2 = new timeHelper(h2, m2, s2);

        System.out.println("First Time: ");
        t1.returnTime();
        System.out.print("Second Time: ");
        t2.returnTime();

        System.out.println("Added Time: ");
        timeHelper added = t1.addTime(t2);

        System.out.println("Subtracted Time: ");
        timeHelper subtracted = t1.subtractTime(t2);
        
        System.out.println("Comparison Result: ");
        t1.compareTime(t2);
    }
}
