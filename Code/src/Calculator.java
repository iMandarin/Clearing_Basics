import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //take input from the user till the user does not press X or x
        int ans = 0;
        while (true)
        {
            System.out.println("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/'|| op == '%' )
            {
                System.out.println("Enter Two Numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                //addition
                if (op == '+') {
                    ans = num1 + num2;

                }

                //subtraction
                else if (op == '-') {
                    ans = num1 - num2;

                }

                //multiplication
                else if (op == '*') {
                    ans = num1 * num2;

                }

                //division
                else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;

                    } else {
                        System.out.println("Number 2 is Zero. Hence Division cannot be carried out.");
                    }
                }

                //modulo operation
                else if (op == '%')
                {
                    ans = num1 % num2;

                }
            }
            //Exit Operation should be done
            else if (op == 'x' || op == 'X')
            {
                System.out.println("See You Next Time!");
                break;
            }
            else
            {
                System.out.println("Invalid Operation");
            }
            System.out.println("The Answer is " + ans + "\n");


        }
    }
}
