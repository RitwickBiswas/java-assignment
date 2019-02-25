import java.util.Scanner;

// Write a program to initialize an integer array with values and check if a given number is present in the array or not.
// If the number is not found, it will print -1 else it will print the index value of the given  number in the array
//Example 1) If the Array elements are  {1,4,34,56,7} and the search element is 90, then the output expected is -1
//
//Example 2)If the Array elements are  {1,4,34,56,7} and the search element is 56, then the output expected is  4
public class arr3 {
    public static void main(String[] args)
    {

        System.out.println("Enter Size of Array: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] a=new int[size];
        System.out.println("Enter Elements of Array: ");
        for(int i=0;i<size;i++)
        {
            a[i]=scan.nextInt();
        }
        System.out.println("Enter the Element to be Found: ");
        int num=scan.nextInt();
        boolean found=false;
        int pos=0;
        for(int i=0;i<size;i++)
        {
            if(num==a[i])
            {
                found=true;
                pos=i;
            }
        }
        if(found==true)
        {
            System.out.println("Element found at index: "+pos);
        }
        else
        {
            System.out.println("-1");
        }
    }
}
