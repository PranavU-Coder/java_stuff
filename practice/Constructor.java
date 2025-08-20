package practice;

class NewBox {
    double length;
    double width;
    double depth;

    NewBox(){
        System.out.println("Constructing a Box ...");
        length = 10;
        width = 20;
        depth = 30;
    }

    double Volume(){
        return length*width*depth;
    }
}
public class Constructor {

    public static void main(String[] args) {
        
        NewBox box = new NewBox();

        box.length = 10;
        box.width = 20;
        box.depth = 30;

        System.out.println("Volume of the box is : " + box.Volume());
    }
}
