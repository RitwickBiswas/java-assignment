import java.util.Scanner;

// Write a program to receive a color code from the user (an Alphabhet). The program should then print the color name, based on the color code given. 
// The following are the color codes.
// R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White. 
// If color code in not valid then print "Invalid Code". 
public class a11{
    public static void main(String args[])
    {
        System.out.println("Enter a Colour Code from the Following R G B O Y W: ");
        Scanner scan = new Scanner(System.in);
        char choice = scan.next().charAt(0);
        switch(choice)
        {
            case 'R': 
            System.out.println("Red");
            break;
            case 'G':
            System.out.println("Green");
            break;
            case 'B':
            System.out.println("Blue");
            break;
            case 'O':
            System.out.println("Orange");
            break;
            case 'Y':
            System.out.println("Yellow");
            break;
            case 'W':
            System.out.println("White");
            break;
            default:
            System.out.println("Invalid Choice");
            break;
        }
    }
}