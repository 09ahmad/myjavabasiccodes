package studentchlng_01;

import com.sun.security.jgss.GSSUtil;

class Cylinder{
    private double radius;
    private double height;
    public Cylinder(){ss
    radius = 1;
    height=1;
    }
    public Cylinder(double r,double h){
        radius = r;
        height = h;
    }
    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }
    public void setRadius(double r){
       if(r>=0)
        radius = r;
       else
           radius=0;
    }
    public void setHeight(double h){
        if(h>=0)
        height=h;
        else
            height=0;
    }
    public double lidarea(){
        return Math.PI*getRadius()*getRadius();
    }
    public double curvedArea(){
        return 2*Math.PI*getRadius()*getHeight();
    }
    public double totalArea(){
        return lidarea()+curvedArea();
    }
    public double volume(){
        return lidarea()*height;
    }

}

public class cylinderTest {
    public static void main(String[] args) {
        Cylinder c= new Cylinder(2,1);
        System.out.println("the lidarea of the cylinder is :"+c.lidarea());
        System.out.println("the total surfae area :"+c.totalArea());
        System.out.println("the volume of the cylinder is "+c.volume());

    }
}
