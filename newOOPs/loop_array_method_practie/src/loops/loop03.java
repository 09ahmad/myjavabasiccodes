package loops;
import java.util.Scanner;
public class loop03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
int sum = 0,i = 0;
        while(i<=n){
        sum = sum+i;
        i++;
        }
        System.out.println("the sum of the numbers is :"+sum);
    }
}
