package restartpractie;
import java.util.Scanner;
public class character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character");
        char op = sc.next().charAt(1);
        System.out.println("character is :" +op);
    }
}
