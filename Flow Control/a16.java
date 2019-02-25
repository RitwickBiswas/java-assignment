//Print all Prime numbers between 10 and 99
public class a16{

    public static boolean isPrime(int x)
    {
        int flag=0;
        for(int i=2;i<x/2;i++)
        {
            if(x%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        for(int i=10;i<=99;i++)
        {
            if(isPrime(i)==true)
            {
                System.out.println(i);
            }
            else
            {
                continue;
            }
        }
    }
}