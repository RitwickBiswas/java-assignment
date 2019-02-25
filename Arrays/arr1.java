//Write a program to initialize an integer array and print the sum and average of the array
import java.util.Scanner;

public class arr1 {
    public static void main(String[] args)
    {
        System.out.println("Enter the size of array: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] arr = new int[size];
        int sum=0;
        System.out.println("Enter Elements");
        for(int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
        }
        System.out.println("Entered Array is: ");
        for(int i=0; i<size; i++)
        {

            System.out.print(arr[i]+" ");
        }

        for(int i=0;i<size;i++)
        {
            sum=sum+arr[i];
        }
        System.out.print("\nSum of array is: "+sum);
        System.out.print("\nAverage of the array is: "+(sum/size));
    }
}
