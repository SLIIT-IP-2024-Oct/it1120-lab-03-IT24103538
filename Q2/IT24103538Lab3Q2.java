import java.util.Scanner;

public class IT24103538Lab3Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the monthly salary
        System.out.print("Enter the monthly salary: ");
        double monthlySalary = scanner.nextDouble();

        // Input for the number of OT hours
        System.out.print("Enter the number of OT hours: ");
        double otHours = scanner.nextDouble();

        // Input for the OT hourly rate
        System.out.print("Enter the OT hourly rate: ");
        double otHourlyRate = scanner.nextDouble();

        // Calculating the OT amount
        double otAmount = otHours * otHourlyRate;

        // Calculating the total salary
        double totalSalary = monthlySalary + otAmount;

        // Displaying the total salary
        System.out.println("The total salary including OT is: " + totalSalary);

        
    }
}
