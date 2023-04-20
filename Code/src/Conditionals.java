// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Conditionals
{
    public static void main(String[] args)
    {

       /*
        Syntax for if statement:
        if (boolean True or False)
        {
            //body
        }
        else
        {
            //do this
        }
        */

        int salary = 15400;
//        if (salary > 10000)
//        {
//            salary = salary + 2000;
//        }
//        else
//        {
//            salary = salary + 1000;
//        }
//        System.out.println(salary);


        //multiple if-else statement
        if (salary > 20000)
        {
            salary+=3000;
        }
        else if (salary> 10000)
        {
            salary+=2000;
        }
        else
        {
            salary+=1000;
        }
        System.out.println(salary);


    }



}
//    public static void main(String[] args) {
//        // Press Alt+Enter with your caret at the highlighted text to see how
//        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }
