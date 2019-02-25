//write a program to test wheather a number is positive negative or Zero
public class a4{
    public static void main(String[] args)
    {
        int x=Integer.parseInt(args[0]);
        if(x<0)
        {
            System.out.println("Negative");
        }
        if(x>0)
        {
            System.out.println("Positive");
        }
        if(x==0)
        {
            System.out.println("Zero");
        }
    }
}