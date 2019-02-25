import java.util.Arrays;
import java.util.Scanner;

//Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array
public class arr5 {
    public static void main(String[] args)
    {
        System.out.println("Enter array size: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] a=new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=scan.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Min 1 = "+a[0]+" Min 2 = "+a[1]+" Max 1 = "+a[size-1]+" Max 2 = "+a[size-2]);
    }
}
