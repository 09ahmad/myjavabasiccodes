package rectangle_new_02;
class Rectangle{

    private double length;
    private double breadth;
    public double getLength(){
        return length;

    }
    public double getBreadth(){
        return breadth;
    }
    public void setLength(double l){
        if(l>=0)
        length=l;
        else
            length=0;
    }
    public void setBreadth(double b){
     if(b>=0)
         breadth=b;
         else
             breadth=0;

    }
    public double area(){
       // return length*breadth;\
        return getLength()*getBreadth();
    }
    public double paremeter(){
        return 2*(length*breadth);
    }

}

public class recangle_02 {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.setLength(-9);
        r.setBreadth(-5);
        System.out.println("the area of the rectangle is "+r.area());

        System.out.println("the circumference of the rectangle is : "+r.paremeter());
        System.out.println("length :"+r.getLength());
        System.out.println("breadth :"+r.getBreadth());
    }
}
