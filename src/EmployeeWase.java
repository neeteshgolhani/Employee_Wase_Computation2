import java.util.Random;
public class EmployeeWase {
    public static final int FULL_TIME = 2;
    public static final int PART_TIME = 1;
    public static final int WAGE_PER_HR = 20;
    public static final int MAX_WORKING_HRS = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to the EmployeeWageComputationalProgram");
        Random random = new Random();
        int isPresent = random.nextInt(3);
        //Check if employee is present
        int totalWage = 0;
        int dailyWage;
        int workingHrs = 0;
        int day = 1, totalWorkingHrs = 0;

        for (day = 1, totalWorkingHrs = 0; day <= MAX_WORKING_HRS
                && totalWorkingHrs < MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs) {
            int present = random.nextInt(3);


            switch (present) {
                case FULL_TIME:
                    workingHrs = 8;
                    System.out.println("Employee Working Fullday");
                    break;
                case PART_TIME:
                    workingHrs = 4;
                    System.out.println("Employee Working Part Time");
                    break;
                default:
                    workingHrs = 0;
                    System.out.println("Employee Absent");
                    break;
            }

            dailyWage = workingHrs * WAGE_PER_HR;
            System.out.println("Day " + day + " workingHrs is " + workingHrs + " wage is: " + dailyWage);
            totalWage += dailyWage;
        }
        System.out.println("Total wage for a month is " + totalWage);

    }
}