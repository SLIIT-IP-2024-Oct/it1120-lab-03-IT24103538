import java.util.Scanner;

public class IT24103538Lab3Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the price of 1 kg of rice
        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        // Input for the number of kilograms
        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantityKg = scanner.nextDouble();

        // Calculating the total amount before discount
        double totalAmount = pricePerKg * quantityKg;

        // Applying a 10% discount
        double discount = totalAmount * 0.10;
        double finalAmount = totalAmount - discount;

        // Displaying the final amount after discount
        System.out.println("The total amount to pay after a 10% discount is: " + finalAmount);

       
    }
}
