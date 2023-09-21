package restartpractie;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the operator");
        char x = sc.next().charAt(0);
        System.out.println("enter the number numbers");
       int num1 = sc.nextInt();
       int num2 = sc.nextInt();
        System.out.println("the numbers are  :"+num1+num2);
     switch(x){
            case'+' :
           int sum = num1+num2;
                System.out.println("sum is  : "+ sum);
                break;
            case '-':
                int sub = num1-num2;
                System.out.println("the substraction is :"+sub);
                break;
            case'*':
                int mul = num1*num2;
                System.out.println("the multiplicationis " +mul);
            break;
            case '/':
                float div = num1/num2;
                System.out.println("the division is :"+div);
             break;
        }


    }
}
