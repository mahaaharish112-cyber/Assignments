import java.util.Scanner;

public class assig3_1 {
    public static void main(String[] args) {
        double celsius;
        double fahrenheitResult;

        Scanner input = new Scanner(System.in);
        celsius = input.nextDouble();
        fahrenheitResult = (celsius * 9/5) + 32;
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");
        
        input.close();
    }
}
