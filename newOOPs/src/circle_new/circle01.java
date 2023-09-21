package circle_new;

class Circle{
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double parameter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return parameter();
    }


}
public class circle01 {
    public static void main(String[] args) {
       Circle c1 = new Circle();
       Circle c2 = new Circle();
       c1.radius = 1;
       c2.radius = 2;
        System.out.println("Area is : " +c1.area() );
        
        System.out.println("paameter is :"+ c1.parameter());
        System.out.println("circumfrene is :"+c1.circumference());
        System.out.println("Area is : " +c2.area() );
        System.out.println("paameter is :"+ c2.parameter());
        System.out.println("circumfrene is :"+c2.circumference());
    }
}
