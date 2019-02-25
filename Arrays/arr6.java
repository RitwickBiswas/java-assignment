import java.util.Arrays;
import java.util.Scanner;

//Write a program to initialize an array and print them in a sorted fashion
public class arr6 {
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
        for(int i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
