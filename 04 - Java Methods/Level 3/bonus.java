import java.util.Random;

public class bonus {
    public static void main(String[] args) {
        final int EMPLOYEE_COUNT = 10;

        // Step 1: Generate Employee Data
        double[][] employeeData = generateEmployeeData(EMPLOYEE_COUNT);

        // Step 2: Calculate Bonus & New Salary
        double[][] updatedData = calculateBonus(employeeData);

        // Step 3: Display Results in a Tabular Format
        displayResults(employeeData, updatedData);
    }

    // Generate random salaries and years of service
    public static double[][] generateEmployeeData(int count) {
        Random random = new Random();
        double[][] data = new double[count][2]; // [salary, years of service]

        for (int i = 0; i < count; i++) {
            data[i][0] = 30000 + random.nextInt(20000); // Salary range: ₹30,000 - ₹50,000
            data[i][1] = 1 + random.nextInt(10);       // Years of service: 1 - 10 years
        }
        return data;
    }

    // Calculate bonus and new salary based on years of service
    public static double[][] calculateBonus(double[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][2]; // [new salary, bonus]

        for (int i = 0; i < employeeData.length; i++) {
            double salary = employeeData[i][0];
            int years = (int) employeeData[i][1];

            double bonusPercentage = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;

            updatedData[i][0] = newSalary;
            updatedData[i][1] = bonus;
        }
        return updatedData;
    }

    // Display results in a tabular format
    public static void displayResults(double[][] employeeData, double[][] updatedData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.printf("%-5s %-12s %-8s %-10s %-12s\n", "ID", "Old Salary", "Years", "Bonus", "New Salary");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            int years = (int) employeeData[i][1];
            double bonus = updatedData[i][1];
            double newSalary = updatedData[i][0];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-5d %-12.2f %-8d %-10.2f %-12.2f\n", i + 1, oldSalary, years, bonus, newSalary);
        }

        System.out.println("-------------------------------------------------------------");
        System.out.printf("TOTAL: %-12.2f %-10.2f %-12.2f\n", totalOldSalary, totalBonus, totalNewSalary);
    }
}
