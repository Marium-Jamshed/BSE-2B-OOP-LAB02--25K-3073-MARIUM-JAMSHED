import java.util.Scanner;

public class OOP6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String username;
        String password;
        double total = 2000;
        String option1;
        int option2;
        String option3; 
        
        System.out.print("Enter username: ");
        username = input.nextLine();

        System.out.print("Enter password: ");
        password = input.nextLine();

        if (username.equals("marium123") && password.equals("meowie")) {
            System.out.println("----WELCOME TO THE BANK OF PAKISTAN!----");

            do {
                
                System.out.print("Enter 'show' to display balance or press Enter to continue: ");
                option1 = input.nextLine();
                if (option1.equalsIgnoreCase("show")) {
                    System.out.println("Your current balance is: $" + total);
                }

            
                System.out.println("Do you want to credit or withdraw money?");
                System.out.println("Enter 1 for credit, 2 for withdrawal: ");
                option2 = input.nextInt();
                input.nextLine(); 

                if (option2 == 1) {
                    System.out.print("Enter amount to credit: ");
                    double add = input.nextDouble();
                    input.nextLine();
                    total += add;
                    System.out.println("Amount credited successfully!");
                } else if (option2 == 2) {
                    System.out.print("Enter amount to withdraw: ");
                    double subtract = input.nextDouble();
                    input.nextLine(); 
                    if (subtract <= total) {
                        total -= subtract;
                        System.out.println("Amount withdrawn successfully!");
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                } else {
                    System.out.println("Invalid option!");
                }

                
                System.out.print("Do you want to perform another transaction? (Y/N): ");
                option3 = input.nextLine();

            } while (option3.equalsIgnoreCase("Y")); 

            // Final balance
            System.out.println("Your final balance is: $" + total);
            System.out.println("Thank you for using the Bank of Pakistan!");

        } else {
            System.out.println("Invalid username or password!");
        }

        input.close();
    }
}
