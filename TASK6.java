import java.util.Scanner;

public class OOP3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name, id;
        int n_courses;

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your Student ID: ");
        id = input.nextLine();

        System.out.print("Enter number of courses: ");
        n_courses = input.nextInt();
        input.nextLine(); // clear buffer

        String[] course = new String[n_courses];

        for (int i = 0; i < n_courses; i++) {
            System.out.print("Enter course " + (i + 1) + " name: ");
            course[i] = input.nextLine();
        }

        // Optional: display data
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Courses:");
        for (int i = 0; i < n_courses; i++) {
            System.out.println("- " + course[i]);
        }

        input.close();
    }
}
