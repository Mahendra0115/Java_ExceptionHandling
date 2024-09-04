import java.util.Scanner;

class CheckSalaryException extends RuntimeException {
    @Override
    public String toString() {
        return "Check Salary Exception: Salary cannot be negative.";
    }
}

class Demo {
    Scanner sc = new Scanner(System.in);
    Integer empNo;
    String empName;
    Integer empSal;

    void accept() {
        System.out.print("Enter the Emp Number: ");
        empNo = sc.nextInt();
        sc.nextLine(); // Fix for the input issue

        System.out.print("Enter the Emp Name: ");
        empName = sc.nextLine();

        System.out.print("Enter the Emp Salary: ");
        empSal = sc.nextInt();

        if (empSal < 0) {
            CheckSalaryException cse = new CheckSalaryException();
            throw cse;
            // throw new CheckSalaryException();
        }
    }

    void display() {
        System.out.println("Emp No: " + empNo);
        System.out.println("Emp Name: " + empName);
        System.out.println("Emp Salary: " + empSal);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
          
        try {
            d.accept(); // First accept the input
            d.display(); // Then display the details
        } catch (CheckSalaryException cse) {
            System.out.println("check salary exception ");
        }

        System.out.println("Program ended.");
    }
}
