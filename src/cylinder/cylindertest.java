package cylinder;

class Cylinder{
    public double height;
    public double radius;
    public double lidArea(){
        return 2*Math.PI*radius;
    }


    public double TSarea(){
        return 2*lidArea()+circumference()*height;
    }
    public double circumference(){
        return 2*Math.PI*radius;
    }
    public double volume(){
        return lidArea()*height;
    }



}

public class cylindertest {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.radius = 5;
        c.height =10;
        System.out.println("lidarea:"+c.lidArea());
        System.out.println("total area : "+c.TSarea() );
        System.out.println("VOlume is :"+c.volume());
    }
}
