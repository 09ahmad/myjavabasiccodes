package reactangle;
class Rectangle {
    private double length;
    private double breadth;
     public double getLength(){
         return length;
     }
     public double getBreadth(){
         return breadth;
     }
     public void setLength(double l){
        if (l>=0)
         length = l;
        else
            length = 0;
     }
     public void setBreath(double b){
        if(b>=0)
            breadth = b;
         else breadth = 0;
     }
    public double area() {
        return getLength()*getBreadth();
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public boolean isSquare() {

        return length == breadth ;

    }
}
public class rectangle01 {
    public static void main(String[] args) {

Rectangle r = new Rectangle();
r.setLength(-10.5);
r.setBreath(5.5);
        System.out.println("ARea is :"+r.area());
        System.out.println("perimeter is :"+ r.perimeter());
        System.out.println("Is it a square : " + r.isSquare());
        System.out.println("Length:"+r.getLength());
        System.out.println("Breath :"+r.getBreadth());
    }
}
