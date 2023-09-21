package restartpractie;
import java.util.Scanner;
public class loopSqsn {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("enter the number  you want to check even or odd");
    int n= sc.nextInt();
    if (n%2==0){
        System.out.println("the number n is even number" +n);
    }
    else System.out.println("the number n is odd :" +n);

    }
}
