//Write a program to initialize an integer array and find the maximum and minimum value of an array
import java.util.Arrays;
import java.util.Scanner;


public class arr2 {
    public static void main(String[] args)
    {
        int size;
        System.out.print("Enter Size: ");
        Scanner scan = new Scanner(System.in);
        size = scan.nextInt();
        int[] a = new int[size];
        System.out.println("Enter Values: ");
        for(int i=0;i<size;i++)
        {
            a[i]=scan.nextInt();
        }
        Arrays.sort(a);
        int min=a[0];
        int max=a[size-1];
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);

    }
}
