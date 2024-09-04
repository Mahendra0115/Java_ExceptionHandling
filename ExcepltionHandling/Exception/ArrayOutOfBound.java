 import java.util.Scanner;
import java.util.Arrays;
 /* 
class Demo{
    public static void main(String[] args) {
    try{
        int arr[] = {4,6,7,5,3};
        int number = arr[6];
        System.out.println(number);
    }catch(ArrayIndexOutOfBoundsException aie){
        System.out.println(aie);

    }
       System.out.println("array are executed: ");
    }
}

*/

class Test{
    public static void main(String[] args) {
        int arr[] = new int[5] ;
        Scanner sc= new Scanner(System.in);
        int i;
        System.out.print("Enter the element of Array: ");
        try{
            for(i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
                    String  Data = Arrays.toString(arr);
                    System.out.println(" "+Data);
            }
        }
        catch(ArrayIndexOutOfBoundsException ex ){
            System.out.println("You are passing element out of Array's Length:");
        }
     System.out.println("axecuted code: ");
    }
}
