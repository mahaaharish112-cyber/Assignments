import java.util.Scanner;

public class assig2_1 {
    public static void main(String[] args){
        float number1;
        float number2;
        Scanner input = new Scanner(System.in);
        number1 = input.nextFloat();
        number2 = input.nextFloat();
        System.out.println("Addtition \n"+number1+"+"+number2+"="+(number1+number2));
        System.out.println("Subtraction \n"+number1+"+"+number2+"="+(number1-number2));
        System.out.println("Multiplication \n"+number1+"+"+number2+"="+(number1*number2));
        System.out.println("Division \n"+number1+"+"+number2+"="+(number1/number2));
        input.close();
    }
}
