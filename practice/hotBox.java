package practice;

class Box {
    private double length;
    private double width;
    private double depth;

    public void setDim(double l , double w, double d){
        width = l;
        length = w;
        depth = d;
    }

    public double Volume(){
        return width*length*depth;
    }
}
public class hotBox {
    public static void main(String[] args){

        Box box = new Box();

        box.setDim(10,20,30);
        System.out.println("Volume of the Box is : " + box.Volume());
    }
}
