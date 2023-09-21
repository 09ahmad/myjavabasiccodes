package loop_2;
import java.util.Scanner;
public class loop2_01 {
    public static void main(String[] args) {
           int n,t,rem;
           int mult = 1;
        System.out.println("enter the number = ");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        t=n;
        while(t>0){
            rem = t%10;
            mult = mult*rem;
            t = t/10;
        }
        System.out.println("the multiplication f the digit is:"+mult);
    }
}
