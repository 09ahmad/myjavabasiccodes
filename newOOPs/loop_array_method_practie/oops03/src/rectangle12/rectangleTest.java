package rectangle12;

import com.sun.security.jgss.GSSUtil;

class Rectangle {
    private double length;
    private double breadth;
      public Rectangle(){
          length = 1;
          breadth=1;
      }
      public Rectangle(double l,double b){
          length = l;
          breadth = b;
      }
      public Rectangle(int s){
          length=breadth=s;
      }
      public double getLength(){
          return length;
      }
public double getBreadth(){
          return breadth;
    }
    public void setLength(double l){
          length=l;
    }
    public void setBreadth(double b){
          breadth=b;
    }
    public double area(){
          return getLength()*getBreadth();
    }
    public double parimeter(){
          return 2*(getLength()+getBreadth());
    }

}
public class rectangleTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,5);
        System.out.println("the area of rectangle is :"+r.area());
        System.out.println("the perimeter of the rectangle is :"+r.parimeter());
    }
}
