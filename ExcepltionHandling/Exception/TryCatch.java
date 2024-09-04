import java.util.Scanner;
import java.util.InputMismatchException;
// import java.util.InputMismatchException;



public class TryCatch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter value of num1: ");
        try {
        int num1 = sc.nextInt();
        System.out.print("enter value of num2: ");
        int num2 = sc.nextInt();
       
            int num3 = num1 / num2;
            System.out.println("Result is : " + num3);

        }catch (ArithmeticException ex) {
            System.out.println("can't devide by 0: ");
            // System.out.println(ex);
        }
        catch (InputMismatchException me) {
            System.out.println("can't divisible by  charactor");
            // System.out.println(me);
        }
        
        System.out.println("all Is Well");
    }

}
