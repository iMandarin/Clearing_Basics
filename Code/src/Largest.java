import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //find the largest number amongst the three numbers
//        int max = a;
//        if (b> max)
//        {
//            max = b;
//        }
//        if (c>max)
//        {
//            max = c;
//        }

        //find the largest number amongst the three numbers in one line
        int max = Math.max(c, Math.max(a,b));

        System.out.println( "Largest Number is "+ max);
    }
}
