package cylinderLatst;

class Cylinder {
    public double radius;
    public double height;

    public Cylinder() {

        radius = 1;
        height = 1;
    }

    public Cylinder(double r, double h) {
        radius = r;
        height = h;
    }


  /*  public double getRadius(){
        return radius;
     }
     public double getHeight(){
        return height;
     }
     public void setRadius(double r) {
         if (r >= 0)
             radius =r ;
         else
             radius = 0;
     }
     public void setHeight(double h){
        if(h>=0)
            height= h;
        else height= 0;*/

    public double lidArea(){
        return 2*Math.PI*radius*radius;
    }
    public double circumference( ){
        return 2*Math.PI*radius;
    }
    public double TSarea(){
        return lidArea()+circumference()*height;

    }
     public double volume(){
        return circumference()*height;
     }
}

public class cylinderTest {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(12,12);
        System.out.println("Lid Area is :"+c.lidArea());
        System.out.println("tottal surface area is :"+c.TSarea());
        System.out.println("volume is : "+c.volume());
    }
        }
