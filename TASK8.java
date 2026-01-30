public class OOP5 {
    public static void main(String[] args) {

        int sumEven = 0; // sum of even numbers
        int sumOdd = 0;  // sum of odd numbers

        // Loop through numbers 1 to 100
        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " is even");
                sumEven += i; // add to even sum
            } else {
                System.out.println(i + " is odd");
                sumOdd += i;  // add to odd sum
            }
        }

        // Display sums
        System.out.println("\nTotal sum of even numbers: " + sumEven);
        System.out.println("Total sum of odd numbers: " + sumOdd);
    }
}
