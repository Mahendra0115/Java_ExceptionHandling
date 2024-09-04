

/*  
class Demo {
    public static void main(String[] args) {
       
        // teking input [ command line Argument ]
        Integer num1 = Integer.parseInt(args[0]);
        try {
        Integer num2 = Integer.parseInt(args[1]);
            Integer num3 = num1/num2;
            System.out.println(num3);
            System.exit(0);// this method use stop to execute finally block
        } catch (ArithmeticException ax) {
            System.out.println("can't divided by 0: ");
        }
        catch(NumberFormatException ex){
            System.out.println("can't divid by char : ");
        }
         finally {
            System.out.println("This is finally block: ");
        }
    }
}

*/

// handle multiple exception in One chatch block 


class Test {
    public static void main(String[] args) {
        try {
            // Parsing the first argument as an integer
            Integer num1 = Integer.parseInt(args[0]);
            
            // Parsing the second argument as an integer
            Integer num2 = Integer.parseInt(args[1]);
            
            // Attempting division
            Integer num3 = num1 / num2;
            System.out.println(num3);
            
        } catch (Exception e) {
            // Handling multiple exceptions in a single catch block using `instanceof`
            if (e instanceof ArithmeticException) {
                System.out.println("Can't divide by 0");
            } else if (e instanceof NumberFormatException) {
                System.out.println("Can't use character input");
            } else {
                System.out.println("An unexpected error occurred: ");
            }
        }
        
        // This will execute regardless of an exception being thrown or not
        System.out.println("All is well");
    }
}
