package WEEK5_6.level1;

import java.util.Scanner;

public class assign3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0;

        System.out.println("Enter heights of 11 football players (in cm):");

        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        double mean = sum / heights.length;

        System.out.println("\nMean height of the football team: " + mean + " cm");

        sc.close();
    }
}