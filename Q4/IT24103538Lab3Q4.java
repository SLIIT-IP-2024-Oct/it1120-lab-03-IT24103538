import java.util.Scanner;

public class IT24103538Lab3Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a five-digit number
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();

        // Check if the number is a five-digit number
        if (number >= 10000 && number <= 99999) {
            // Separate each digit using integer division and modulus operations
            int digit1 = number / 10000;        // Get the first digit
            int digit2 = (number / 1000) % 10;  // Get the second digit
            int digit3 = (number / 100) % 10;   // Get the third digit
            int digit4 = (number / 10) % 10;    // Get the fourth digit
            int digit5 = number % 10;           // Get the fifth digit

            // Print the digits separated by spaces
            System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);
        } else {
            System.out.println("Error: Please enter a valid five-digit number.");
        }

        
    }
}
