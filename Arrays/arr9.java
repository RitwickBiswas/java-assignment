import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
// Write a program to print the sum of the elements of an array following the given below condition.
//
//If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.

public class arr9 {
    public static void main(String args[])
    {
        System.out.println("Enter array Size: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] a = new int[size];
        System.out.println("Enter array Elements: ");
        for(int i = 0;i<size;i++)
        {
            a[i]=scan.nextInt();
        }
        //Arrays.sort(a);
        int sum=0;
        boolean add=true;
        for(int i=0;i<size;i++)
        {
            if(add==true && a[i]!=6)
            {
                sum=sum+a[i];
            }
            else if(a[i]==6)
            {
                add=false;
            }
            else if(a[i]==7)
            {
                add=false;
            }
        }
        System.out.println(sum);

    }
}
