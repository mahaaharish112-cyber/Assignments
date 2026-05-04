package WEEK5_6.level2;
import java.util.Scanner;

public class assign1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        float[] height = new float[3];

        System.out.println("Enter ages of Amar, Akbar, and Anthony:");
        for (int i = 0; i < 3; i++) {
            System.out.print(names[i] + ": ");
            age[i] = sc.nextInt();
        }

        System.out.println("\nEnter heights of Amar, Akbar, and Anthony (in cm):");
        for (int i = 0; i < 3; i++) {
            System.out.print(names[i] + ": ");
            height[i] = sc.nextFloat();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }

            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("\nYoungest Friend: " + names[youngestIndex] +
                " (Age: " + age[youngestIndex] + ")");

        System.out.println("Tallest Friend: " + names[tallestIndex] +
                " (Height: " + height[tallestIndex] + " cm)");

        sc.close();
    }
}
