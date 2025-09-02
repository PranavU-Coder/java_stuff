package inheritance;

import java.util.Scanner;

class ActualArea {
    double length;
    double breadth;

    void setDimensions(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double calculateArea() {
        return length * breadth;
    }
}

class Rectangle extends ActualArea {
    Rectangle(double length, double breadth) {
        setDimensions(length, breadth);
    }

    void displayArea() {
        System.out.println("Area of Rectangle: " + calculateArea());
    }
}

class Square extends ActualArea {
    Square(double side) {
        setDimensions(side, side);  
    }

    public void displayArea() {
        System.out.println("Area of Square: " + calculateArea());
    }
}

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        double rectLength = scanner.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double rectBreadth = scanner.nextDouble();
        Rectangle rect = new Rectangle(rectLength, rectBreadth);
        rect.displayArea();

        System.out.print("Enter side of square: ");
        double squareSide = scanner.nextDouble();
        Square sq = new Square(squareSide);
        sq.displayArea();

        scanner.close();
    }
}
