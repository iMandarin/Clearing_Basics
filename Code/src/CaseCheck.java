import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        //String word = "hello";
      //  System.out.println(word.charAt(2)); this will the character present at index 2. index starts at 0 therefore the O/P will be l.

        if (ch > 'a' && ch <= 'z')
        {
            System.out.println("LowerCase");
        }
        else
        {
            System.out.println("UpperCase");
        }
        System.out.println(ch);
    }
}
