//Write a program to check if a given integer number is odd or even.
public class a5{
    public static void main(String[] args)
    {
        int x = Integer.parseInt(args[0]);
        if(x==0)
        {
            System.out.println("Even");
        }
        else 
        {
            if(x%2==0)
            {
                System.out.println("Even");
            }
            else
            {
                System.out.println("Odd");
            }
        }
    }
}