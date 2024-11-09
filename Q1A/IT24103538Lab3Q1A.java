import java.util.Scanner;

public class IT24103538Lab3Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //price of 1 kg of rice
        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        //number of kilograms
        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantityKg = scanner.nextDouble();

        // Calculating total amount
        double totalAmount = pricePerKg * quantityKg;

        // Displaying the total amount
        System.out.println("The total amount to pay is: " + totalAmount);

        
    }
}
