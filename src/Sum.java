import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Two Numbers: \n");

        float num1 = input.nextFloat();
        float num2 = input.nextFloat();

        float sum = num1 + num2;
        System.out.println("Sum of two numbers is: " + sum);
    }
}
