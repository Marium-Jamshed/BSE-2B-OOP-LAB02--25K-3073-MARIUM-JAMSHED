import java.util.Scanner;

public class ProcessGrades {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Examinations Department Grade Processor!");
        System.out.print("How many students do you want to process grades for? ");
        int n = input.nextInt();

        int[] marks = new int[n];
        int total = 0;
        int passCount = 0;
        int failCount = 0;

        System.out.println("\nPlease enter the marks for each student (0-100):");

        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = input.nextInt();

            // Accumulate total marks
            total += marks[i];

            // Count pass/fail
            if (marks[i] >= 60) {
                passCount++;
            } else {
                failCount++;
            }
        }

        // Calculate average
        double average = (double) total / n;

        // Display human-friendly results
        System.out.println("\n===== Grade Summary =====");
        System.out.println("Total students processed : " + n);
        System.out.printf("Average marks            : %.2f\n", average);
        System.out.println("Number of students passed: " + passCount);
        System.out.println("Number of students failed: " + failCount);

        // Optional: Show each student's result
        System.out.println("\nIndividual Results:");
        for (int i = 0; i < n; i++) {
            String result = (marks[i] >= 60) ? "Pass" : "Fail";
            System.out.println("Student " + (i + 1) + ": " + marks[i] + " - " + result);
        }

        System.out.println("\nThank you for using the Grade Processor!");
        input.close();
    }
}
