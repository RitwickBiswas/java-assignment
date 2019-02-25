// Write a Program to accept two integers as command line arguments and print the sum of the two numbers

// Example:

//      C:\>java Sample 10 20

//      O/P Expected : The sum of 10 and 20 is 30

public class a3{
    public static void main(String[] args)
    {
        int sum=0;
        for (int i=0;i<args.length;i++)
        {
            sum=sum+Integer.parseInt(args[i]);
        }
        System.out.println("The sum of "+args[0]+" and "+args[1]+" is " + sum);
    }
}