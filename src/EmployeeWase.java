import java.util.Random;

public class EmployeeWase {
    public static void main(String[] args) {
        System.out.println("Welcome to the EmployeeWageComputationalProgram");
        Random random = new Random();
        int present = random.nextInt(2);
        //Check if employee is present
        if (present == 1)
            System.out.println("Employee is present.");
        else
            System.out.println("Employee is absent.");
    }
}
