import java.util.Scanner;

public class OOP4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter maximum number of items you may purchase: ");
        int max_items = input.nextInt();
        input.nextLine(); // clear buffer

        String[] name = new String[max_items];
        double[] price = new double[max_items];
        int n_items = 0;  // actual number of items entered

        double sub_total = 0;
        double discountRate = 0.10;
        double tax = 5;

        String choice;

        do {
            System.out.print("Enter name of snack " + (n_items + 1) + ": ");
            name[n_items] = input.nextLine();

            System.out.print("Enter price of " + name[n_items] + ": ");
            price[n_items] = input.nextDouble();
            input.nextLine(); // clear buffer

            sub_total += price[n_items];
            n_items++; // increase count

            if (n_items >= max_items) {
                System.out.println("Reached maximum number of items.");
                break;
            }

            System.out.print("Add another item? Y/N: ");
            choice = input.nextLine();

        } while (choice.equalsIgnoreCase("Y")); // accepts Y or y

        // Calculate discount & totals
        double discountAmount = sub_total * discountRate;
        double discountedTotal = sub_total - discountAmount;
        double totalWithTax = discountedTotal + tax;

        // Display output
        System.out.println("\n--- Purchase Summary ---");
        for (int i = 0; i < n_items; i++) {
            System.out.printf("%-15s : $%.2f\n", name[i], price[i]);
        }

        System.out.printf("Subtotal       : $%.2f\n", sub_total);
        System.out.printf("Discount (10%%) : $%.2f\n", discountAmount);
        System.out.printf("After Discount : $%.2f\n", discountedTotal);
        System.out.printf("Sales Tax      : $%.2f\n", tax);
        System.out.printf("Total to Pay   : $%.2f\n", totalWithTax);

        input.close();
    }
}
