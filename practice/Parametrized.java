package practice;

import java.util.Scanner;

class ParamBox {

    double length;
    double width;
    double depth;

    ParamBox(double l, double w, double d) {
        length = l;
        width = w;
        depth = d;
    }

    public double Volume() {
        return length * width * depth;
    }
}

public class Parametrized {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter length: ");
        double length = input.nextDouble();

        System.out.print("enter width: ");
        double width = input.nextDouble();

        System.out.print("enter depth: ");
        double depth = input.nextDouble();

        ParamBox box = new ParamBox(length, width, depth);

        System.out.println("Volume of the box is : " + box.Volume());

        input.close();
    }
}
