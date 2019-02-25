import java.util.Scanner;

// Initialize a character variable in a program and print 'Alphabhet' if the initialized value is an alphabhet, print 'Digit' if the initialized value is a number, and print 'Special Character', if the initialized value is anything else.

public class a8{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        char in = scan.next().charAt(0);
        if(in>=48 && in<=57 || in==45)
        {
            System.out.println("Digit");
        }
        else if((in>='a' && in<='z')||(in>='A'&& in<='Z'))
        {
            System.out.println("Alphabet");
        }
        else
        {
            System.out.println("Special Character");
        }
    }
}