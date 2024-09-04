// package ExceptionHandling;

import java.util.Scanner;
import java.util.InputMismatchException;
public class MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter frist value :");
        int num1 = sc.nextInt();
        try{
           
            System.out.print("enter Second value:");
            int num2 = sc.nextInt();
            int num3 = num1/num2;
            System.out.println(num3);
        }
        catch(ArithmeticException ex){
            System.out.println("can't accept 0: ");
        }
        catch(InputMismatchException ex){
            System.out.println("can't accept 0: ");
        }

      
        System.out.println("all is well");
    }
}
