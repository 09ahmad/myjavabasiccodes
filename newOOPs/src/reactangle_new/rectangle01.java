package reactangle_new;

class Rectangle{
    public double length;
    public double breadth;
    public double area(){
        return length*breadth;
    }
    public double paremeter(){
        return 2*(length+breadth);
    }
}

public class rectangle01 {
    public static void main(String[] args) {
     Rectangle r1 = new Rectangle();
     r1.length = 10;
     r1.breadth = 10;
        System.out.println("the area of the rectangle is :"+r1.area());
        System.out.println("the paremeter of the rectangle is :"+r1.paremeter());

    }
}
