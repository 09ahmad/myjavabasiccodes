package restartpractie;
import java.util.Scanner;
public class areaofcircle {
    public static void main(String[] args) {
        float radius;
        double pi=3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the parameter of the circle");

         radius = sc.nextInt();
        System.out.println("the radius of  thr circle is :"+radius);
       double  area = pi*radius*radius;
        System.out.println("the area of the circle  is :" +area);

    }
}
