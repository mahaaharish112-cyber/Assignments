package WEEK7_8.level2;
import java.util.Scanner;

public class assign2 {

    // Method to check leap year
    public static boolean isLeapYear(int year) {

        // Condition: year must be >= 1582
        if (year < 1582) {
            return false;
        }

        // Leap year logic
        boolean conditionA = (year % 4 == 0) && (year % 100 != 0);
        boolean conditionB = (year % 400 == 0);

        return conditionA || conditionB;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check valid Gregorian year
        if (year < 1582) {
            System.out.println("Please enter a year >= 1582 (Gregorian calendar).");
        } else {
            // Call method
            boolean result = isLeapYear(year);

            // Output result
            if (result) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }

        sc.close();
    }
}
