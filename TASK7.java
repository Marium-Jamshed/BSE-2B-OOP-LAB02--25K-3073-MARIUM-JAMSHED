import java.util.Scanner;

public class OOP4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n_items;
        double sub_total = 0;
        double discount = 0.1;

        System.out.print("Enter number of items you want to purchase: ");
        n_items = input.nextInt();
        input.nextLine(); // clear buffer

        double[] price = new double[n_items];
        String[] name = new String[n_items];

        for (int i = 0; i < n_items; i++) {
            System.out.print("Enter name of the snack: ");
            name[i] = input.nextLine();

            System.out.print("Enter the price of " + name[i] + ": ");
            price[i] = input.nextDouble();
            input.nextLine(); // clear buffer

            sub_total += price[i];
        }

        System.out.println("\nThe sub-total is $" + sub_total);
        double discountAmount = sub_total * discount;
        System.out.println("Discount (10%) is $" + discountAmount);

        double discountedTotal = sub_total - discountAmount;
        System.out.println("Total after discount: $" + discountedTotal);

        double totalWithTax = discountedTotal + 5; // $5 tax
        System.out.println("Sales tax: $5");
        System.out.println("Total amount to pay: $" + totalWithTax);

        input.close();
    }
}
