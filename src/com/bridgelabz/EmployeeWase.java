package com.bridgelabz;

import java.util.Random;

public class EmployeeWase {

    // Constants for full-time, part-time, and maximum working hours per month
    public static final int FULL_TIME = 2;
    public static final int PART_TIME = 1;
    public static final int MAX_WORKING_HRS_PER_MONTH = 100;

    // Method to compute employee wage for a company
    public static void computeEmployeeWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs) {
        Random random = new Random(); // Creating a new instance of the Random class
        int workingHrs = 0; // Initializing working hours variable to 0
        int day = 1; // Initializing day variable to 1
        int totalWage = 0; // Initializing total wage variable to 0
        int totalWorkingHrs = 0; // Initializing total working hours variable to 0

        // Loop through each working day while total working hours is less than maximum hours and days have not exceeded the maximum number of working days
        while (day <= maxWorkingDays && totalWorkingHrs < maxWorkingHrs) {
            int present = random.nextInt(3); // Generate a random number between 0 and 2

            // Switch statement to determine whether employee is full-time, part-time or absent
            switch (present) {
                case FULL_TIME:
                    workingHrs = 8; // If present is 2, employee is full-time and works 8 hours
                    System.out.println("Employee Working Full day");
                    break;
                case PART_TIME:
                    workingHrs = 4; // If present is 1, employee is part-time and works 4 hours
                    System.out.println("Employee Working Part time");
                    break;
                default:
                    workingHrs = 0; // If present is 0, employee is absent and does not work
                    System.out.println("Employee is Absent");
                    break;
            }

            totalWorkingHrs += workingHrs; // Add the working hours to the total working hours
            int dailyWage = workingHrs * wagePerHr; // Calculate the daily wage
            System.out.println("Day " + day + " workingHrs is " + workingHrs + " wage is: " + dailyWage); // Print the day, working hours and wage for the day
            totalWage += dailyWage; // Add the daily wage to the total wage
            day++; // Increment the day counter
        }

        // Print the total wage for the month for the given company
        System.out.println("Total wage for " + companyName + " is " + totalWage);
    }
}
