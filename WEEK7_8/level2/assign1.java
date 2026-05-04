package WEEK7_8.level2;
import java.util.Scanner;

public class assign1 {

    // Method to calculate sum using recursion
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1; // Base case
        }
        return n + recursiveSum(n - 1);
    }

    // Method to calculate sum using formula
    public static int formulaSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check if natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {
            // Calculate using recursion
            int recursiveResult = recursiveSum(n);

            // Calculate using formula
            int formulaResult = formulaSum(n);

            // Display results
            System.out.println("Sum using recursion: " + recursiveResult);
            System.out.println("Sum using formula: " + formulaResult);

            // Compare results
            if (recursiveResult == formulaResult) {
                System.out.println("Both results are equal. The computation is correct.");
            } else {
                System.out.println("Results are NOT equal. There is an error.");
            }
        }

        sc.close();
    }
}