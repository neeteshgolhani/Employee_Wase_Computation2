import com.bridgelabz.EmpWageBuilder;

class main {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wase Computation problems");
        int company1Wage = EmpWageBuilder.computeEmpWage("Company 1", 20, 20, 100);
        int company2Wage = EmpWageBuilder.computeEmpWage("Company 2", 25, 22, 120);
        // You can add more companies here

        // Get total wage for a specific company
        String queryCompany = "Company 2";
        int totalWage = 0;
        if (queryCompany.equals("Company 1")) {
            totalWage = company1Wage;
        } else if (queryCompany.equals("Company 2")) {
            totalWage = company2Wage;
        }
        // You can add more companies here
        System.out.println("Total wage for " + queryCompany + " is " + totalWage);
    }
}
