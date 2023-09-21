package cylinder_new;

import com.sun.security.jgss.GSSUtil;

class Cylinder{
    public double radius;
    public double height;
    public double lidArea(){
        return Math.PI*radius*height;
    }
    public double totalSarea(){
      return 2*lidArea()+circumference()*height;
    }
public double circumference(){
        return 2*lidArea();
}
  public double volume(){
        return lidArea()*height;
  }
}

public class newcylinder_01 {
    public static void main(String[] args) {

        Cylinder c1 = new Cylinder();
        c1.radius = 5.5;
        c1.height = 8;
        System.out.println("the lid area of the cylinder is :"+c1.lidArea());
        System.out.println("total surface area of the cylinfder is :"+c1.totalSarea() );
        System.out.println("the curved surface area of thee cylinder is :"+c1.circumference());
        System.out.println("volume of the cylinder is :"+c1.volume());
    }
}
