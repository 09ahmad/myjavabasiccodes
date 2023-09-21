package restartpractie;
import java.util.Scanner;
public class takingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("your lucky number is :" +number);
        String name = sc.next();
        System.out.println("your name is : " +name);


    }
}
