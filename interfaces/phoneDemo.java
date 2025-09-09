package interfaces;

import java.util.Scanner;

class Phone {
    String brand;
    int memCapacity;

    public Phone(String brand, int memCapacity) {
        this.brand = brand;
        this.memCapacity = memCapacity;
    }

    interface Callable {
        void makeAudioCall(String cellNum);
        void makeVideoCall(String cellNum);
    }
}

class BasicPhone extends Phone implements Phone.Callable {

    public BasicPhone(String brand, int memCapacity) {
        super(brand, memCapacity);
    }

    public void makeAudioCall(String cellNum) {
        System.out.println("BasicPhone (" + brand + ") making audio call to " + cellNum);
    }
    
    public void makeVideoCall(String cellNum) {
        System.out.println("BasicPhone (" + brand + ") cannot make video calls.");
    }
}

class SmartPhone extends Phone implements Phone.Callable {

    public SmartPhone(String brand, int memCapacity) {
        super(brand, memCapacity);
    }

    public void makeAudioCall(String cellNum) {
        System.out.println("SmartPhone (" + brand + ") making audio call to " + cellNum);
    }

    public void makeVideoCall(String cellNum) {
        System.out.println("SmartPhone (" + brand + ") making video call to " + cellNum);
    }
}

public class phoneDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter brand for BasicPhone: ");
        String basicBrand = input.nextLine();
        System.out.print("Enter memory capacity for BasicPhone: ");
        int basicMem = input.nextInt();
        input.nextLine();
        BasicPhone basicPhone = new BasicPhone(basicBrand, basicMem);

        System.out.print("Enter brand for SmartPhone: ");
        String smartBrand = input.nextLine();
        System.out.print("Enter memory capacity for SmartPhone: ");
        int smartMem = input.nextInt();
        input.nextLine();
        SmartPhone smartPhone = new SmartPhone(smartBrand, smartMem);

        System.out.print("Enter number to call: ");
        String cellNum = input.nextLine();

        System.out.println("\nCalling from BasicPhone:");
        basicPhone.makeAudioCall(cellNum);
        basicPhone.makeVideoCall(cellNum);

        System.out.println("\nCalling from SmartPhone:");
        smartPhone.makeAudioCall(cellNum);
        smartPhone.makeVideoCall(cellNum);

        input.close();
    }
}
