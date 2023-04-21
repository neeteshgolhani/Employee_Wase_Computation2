package com.bridgelabz;

import java.util.Random;

public class EmpWageBuilder {

    // Declare constants for employee status
    public static final int FULL_TIME = 2;
    public static final int PART_TIME = 1;

    // Define a method to compute the employee wage
    public static int computeEmpWage(String company, int wagePerHr, int maxWorkingDays, int maxWorkingHrs) {
        // Print a welcome message with the company name
        System.out.println("Welcome to the EmployeeWageComputationalProgram for " + company);

        // Create a random number generator
        Random random = new Random();

        // Initialize variables for tracking employee status, wage, and hours worked
        int isPresent = random.nextInt(3);
        int totalWage = 0;
        int dailyWage;
        int workingHrs = 0;
        int day = 1, totalWorkingHrs = 0;

        // Loop through the working days and hours until the maximums are reached
        while (day <= maxWorkingDays && totalWorkingHrs < maxWorkingHrs) {
            // Generate a random number to determine the employee's status for the day
            int present = random.nextInt(3);

            // Set the number of hours worked based on the employee's status
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

            // Update the total number of hours worked and calculate the daily wage
            totalWorkingHrs += workingHrs;
            dailyWage = workingHrs * wagePerHr;

            // Print the daily wage and increment the total wage
            System.out.println("Day " + day + " workingHrs is " + workingHrs + " wage is: " + dailyWage);
            totalWage += dailyWage;

            // Increment the day counter
            day++;
        }

        // Print the total wage for the company and return it
        System.out.println("Total wage for " + company + " is " + totalWage);
        return totalWage;
    }
}
