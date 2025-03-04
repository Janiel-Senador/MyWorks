import java.util.Scanner;

public class PurchaseApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Purchase[] purchases = new Purchase[5]; // Array to store 5 Purchase objects

        for (int i = 0; i < 5; i++) {
            int invoiceNumber;
            double saleAmount;

            // Validate invoice number (1000 - 8000)
            while (true) {
                System.out.print("Enter invoice number (1000-8000) for Purchase " + (i + 1) + ": ");
                invoiceNumber = scanner.nextInt();
                if (invoiceNumber >= 1000 && invoiceNumber <= 8000) {
                    break;
                }
                System.out.println("Invalid invoice number! Must be between 1000 and 8000.");
            }

            // Validate non-negative sale amount
            while (true) {
                System.out.print("Enter sale amount (non-negative) for Purchase " + (i + 1) + ": ");
                saleAmount = scanner.nextDouble();
                if (saleAmount >= 0) {
                    break;
                }
                System.out.println("Invalid sale amount! Must be non-negative.");
            }

            // Create and store Purchase object
            purchases[i] = new Purchase(invoiceNumber, saleAmount);
        }

        scanner.close();

        // Display all purchases
        System.out.println("\nAll Purchase Details:");
        for (Purchase purchase : purchases) {
            purchase.display();
        }
    }
}