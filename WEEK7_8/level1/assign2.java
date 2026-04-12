package WEEK7_8.level1;
import java.util.Scanner;

public class assign2 {

    // Method to calculate number of handshakes
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calling method
        int handshakes = calculateHandshakes(numberOfStudents);

        // Output
        System.out.println("The maximum number of possible handshakes is: " + handshakes);

        sc.close();
    }
}