import java.util.Arrays;
import java.util.Scanner;

//Write a program to remove the duplicate elements in an array and print
//Eg) Array Elements-12,34,12,45,67,89
//O/P: 12,34,45,67,89
public class arr7 {
    public static void main(String[] args)
    {
        System.out.println("Enter Array Size: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] a = new int[size];
        int[] temp = new int[size];
        int j=0;
        int hold=0;
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<size;i++)
        {
            a[i]=scan.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<size-1;i++)
        {
            if(a[i]!=a[i+1])
            {
                temp[j++]=a[i];
            }
        }
        temp[j++]=a[size-1];
        for (int i = 0;i<j;i++)
        {
            a[i]=temp[i];
        }
        for (int i = 0;i<j;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
