import java.util.Scanner;

public class assign3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a Natural Number");
        } 
        else {
            long factorial = 1;

            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }

            System.out.println("Factorial = " + factorial);
        }
        sc.close();
    }
}
