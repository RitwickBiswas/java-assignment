import java.util.Scanner;

// Write a program to print the element of an array that has occurred the highest number of times
//Eg) Array -> 10,20,10,30,40,100,99
//O/P:10
public class arr8 {
    public static void main(String[] args)
    {
        int ele=0;
        int max=0;
        System.out.println("Enter Array Size: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] a=new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=scan.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            int count=0;
            for(int j=0;j<size;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                }
            }
            if(count>=max)
            {
                max=count;
                ele=a[i];
            }
        }
        System.out.print(ele);
    }
}
