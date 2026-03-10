import java.util.Scanner;

public class assig3_2 {
    public static void main(String[] args) {
        int number1;
        int number2;
        int temp;
        Scanner input = new Scanner(System.in);
        number1 = input.nextInt();
        number2 = input.nextInt();
        temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
        
        input.close();
    }
}
