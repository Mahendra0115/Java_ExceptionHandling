class Demo {

    void m1(){

        System.out.println(" m1 In");

        // int x = 10/0;
                // (or)
        // throw new ArithmeticException();
               //  (or)
    ArithmeticException ae = new ArithmeticException();
      throw ae;
        

        // System.out.println(" m1 Out ");
    }
    void m2(){
        System.out.println(" m2 In");
        m1();
        System.out.println(" m2 Out ");
      
    }
    void m3(){
        System.out.println(" m3 In");
        m2();
        System.out.println(" m3 Out ");
    }
       
    public static void main(String[] args) {
        
        
        try{
            new Demo().m3();
        }
        catch(ArithmeticException ae){
            System.out.println("can't devided by 0: "+ae);
            

        }
        System.out.println("all is well ");
    }
}
