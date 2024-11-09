import java.util.Scanner;

public class IT24103538Lab3Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the rupee amount
        System.out.print("Enter the rupee amount: ");
        int amount = scanner.nextInt();

        // Define variables for each denomination and initialize counts to 0
        int notes5000 = 0; // Number of 5000 rupee notes
        int notes1000 = 0; // Number of 1000 rupee notes
        int notes500 = 0;  // Number of 500 rupee notes
        int notes200 = 0;  // Number of 200 rupee notes
        int notes100 = 0;  // Number of 100 rupee notes
        int notes50 = 0;   // Number of 50 rupee notes
        int notes20 = 0;   // Number of 20 rupee notes
        int notes10 = 0;   // Number of 10 rupee notes
        int coins5 = 0;    // Number of 5 rupee coins
        int coins2 = 0;    // Number of 2 rupee coins
        int coins1 = 0;    // Number of 1 rupee coins

        // Calculate the number of 5000 notes
        notes5000 = amount / 5000;
        amount = amount % 5000; // Update amount with the remainder

        // Calculate the number of 1000 notes
        notes1000 = amount / 1000;
        amount = amount % 1000;

        // Calculate the number of 500 notes
        notes500 = amount / 500;
        amount = amount % 500;

        // Calculate the number of 200 notes
        notes200 = amount / 200;
        amount = amount % 200;

        // Calculate the number of 100 notes
        notes100 = amount / 100;
        amount = amount % 100;

        // Calculate the number of 50 notes
        notes50 = amount / 50;
        amount = amount % 50;

        // Calculate the number of 20 notes
        notes20 = amount / 20;
        amount = amount % 20;

        // Calculate the number of 10 notes
        notes10 = amount / 10;
        amount = amount % 10;

        // Calculate the number of 5 coins
        coins5 = amount / 5;
        amount = amount % 5;

        // Calculate the number of 2 coins
        coins2 = amount / 2;
        amount = amount % 2;

        // Calculate the number of 1 coins
        coins1 = amount;

        // Display the results
        System.out.println("Denominations:");
        System.out.println("5000 Notes - " + notes5000);
        System.out.println("1000 Notes - " + notes1000);
        System.out.println("500 Notes - " + notes500);
        System.out.println("200 Notes - " + notes200);
        System.out.println("100 Notes - " + notes100);
        System.out.println("50 Notes - " + notes50);
        System.out.println("20 Notes - " + notes20);
        System.out.println("10 Notes - " + notes10);
        System.out.println("5 Coins - " + coins5);
        System.out.println("2 Coins - " + coins2);
        System.out.println("1 Coins - " + coins1);

              
    }
}
