import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();
       // int num2 = input.nextFloat(); // this sentence will throw an error because we are narrowing the input.
        // Error will be: java: incompatible types: possible lossy conversion from float to int

        //typecasting
        //  int num = (int) 65.67f; // writing int on the right side before the input value will convert the Float input into the INT input.
        // System.out.println(num);

        //automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte) a; //257 % 256 = 1
        // System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a * b) / c; // here the expression a * b  is carried out after promoting both variables to  int datatype;
//        System.out.println(d);

//automatic type promotion

//        int number = 'A';
//        System.out.println(number);
        //output:
        // 65

        //java follows unicode principles
//        System.out.println("नमस्ते");
//        System.out.println("你好");
        // you can print the values as it is. as Java follows unicode principles.
        // output:
        // नमस्ते
        // 你好

        // Rules for Type Promotion
        // 1. All the byte,short, char values are promoted to integer.
        // 2. Any one of the operands is long then the whole operation will be promoted to long.
        // 3. Any one of the operands is float then the whole operation will be promoted to float.
        // so on and so forth for other types...
        //e.g.

        //System.out.println( 3* 5.6);
        //output will be a float value for the above operation statement.

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.123456;
        double result = (f* b) + (i/c) - (d*s);
        System.out.println((f* b) +" " + (i/c) + " " + (d*s));
        //if you have multiple types in one expression then all the other will be promoted to the biggest type in the expression.

        System.out.println(result);







    }
}
