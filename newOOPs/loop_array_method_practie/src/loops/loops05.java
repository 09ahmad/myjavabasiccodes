package loops;
import java.util.Scanner;
public class loops05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int sum = 0,t,rem=0;
        t= n;
        while(t!=0){
            rem= t%10;
            sum = sum+rem;
            t = t/10;
        }
        System.out.println("the sum of the  digits is :"+sum);

    }
}
