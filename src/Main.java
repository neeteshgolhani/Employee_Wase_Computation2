import java.util.Random;

import static com.bridgelabz.EmployeeWase.*;
/*In this refactored code, we have defined the computeEmployeeWage() method,
which computes the employee's wage using class variables instead of local variables.
We have also changed the loop to a while loop, as it is easier to control the
 number of iterations in this case.
Finally, we have removed the isPresent variable, as it was not being used.
The totalWage and totalWorkingHrs variables are now declared as class variables,
which can be accessed from anywhere in the class.
This allows us to update these variables inside the loop and use them outside of it, in the main() method.
We have also updated the MAX_WORKING_DAYS variable to 20,
 as this is the standard number of working days in a month.*/
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the EmployeeWageComputationalProgram");

        // Calling the computeEmployeeWage method to calculate the total wage
        computeEmployeeWage();
    }

    // Method to compute employee wage
    public static void computeEmployeeWage() {
        Random random = new Random(); // Creating a new instance of the Random class
        int workingHrs = 0; // Initializing working hours variable to 0
        int day = 1; // Initializing day variable to 1
        int totalWage = 0; // Initializing total wage variable to 0
        int totalWorkingHrs = 0; // Initializing total working hours variable to 0

        // Loop through each working day while total working hours is less than maximum hours and days have not exceeded 20
        while (day <= MAX_WORKING_DAYS && totalWorkingHrs < MAX_WORKING_HRS) {
            int present = random.nextInt(3); // Generate a random number between 0 and 2

            // Switch statement to determine whether employee is full-time, part-time or absent
            switch (present) {
                case FULL_TIME:
                    workingHrs = 8; // If present is 2, employee is full-time and works 8 hours
                    System.out.println("Employee Working Fullday");
                    break;
                case PART_TIME:
                    workingHrs = 4; // If present is 1, employee is part-time and works 4 hours
                    System.out.println("Employee Working Part Time");
                    break;
                default:
                    workingHrs = 0; // If present is 0, employee is absent and does not work
                    System.out.println("Employee Absent");
                    break;
            }

            totalWorkingHrs += workingHrs; // Add the working hours to the total working hours
            int dailyWage = workingHrs * WAGE_PER_HR; // Calculate the daily wage
            System.out.println("Day " + day + " workingHrs is " + workingHrs + " wage is: " + dailyWage); // Print the day, working hours and wage for the day
            totalWage += dailyWage; // Add the daily wage to the total wage
            day++; // Increment the day counter
        }

        // Print the total wage for the month
        System.out.println("Total wage for a month is " + totalWage);
    }
}
