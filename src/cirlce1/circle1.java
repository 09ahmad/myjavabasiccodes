package cirlce1;

class Circle{
    public double radius;
    public double area(){
        return Math.PI*radius*radius ;
    }
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
    public double circumference(){
        return perimeter();
    }
}

public class circle1 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 7;

        Circle c2 = new Circle();

        System.out.println("area:"+c1.area());
        System.out.println("perimeter:"+c1.perimeter());
        System.out.println("circumference :"+c1.circumference());

        System.out.println("area2:"+c2.area());
        System.out.println("perimeter2:"+c2.perimeter());
        System.out.println("circumference 2:"+c2.circumference());
    }
}
