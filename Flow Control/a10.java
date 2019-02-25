// Initialize a character variable with an alphabhet in a program. If the character value is in lowercase, the outut should be displayed in uppercase in the following format.
// Example1)
// i/p:a
// o/p:a->A
// If the character value is in uppercase, the outut should be displayed in lowercase in the following format.
// Example2)
// i/p:A
// o/p:A->a
import java.util.Scanner;
public class a10{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        char a=scan.next().charAt(0);
        
        if(Character.isUpperCase(a))
        {
            System.out.println(Character.toLowerCase(a));
        }
        else{
            System.out.println(Character.toUpperCase(a));
        }
    }
}