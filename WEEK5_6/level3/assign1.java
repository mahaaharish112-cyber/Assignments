package WEEK5_6.level3;
import java.util.Scanner;

public class assign1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        int[] digits = new int[count];
        temp = num;

        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        int[] frequency = new int[10];
        for (int i = 0; i < count; i++) {
            int digit = digits[i];
            frequency[digit]++;
        }

        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        sc.close();
    }
}
