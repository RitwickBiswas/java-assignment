import java.util.Scanner;

//Write a program to print first 5 values which are divisible by 2, 3, and 5.
public class printValues {
    public static void main(String[] args)
    {
        System.out.println("Enter a Number");
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();;
        int count=0;
        while(count!=5)
        {
            if(num%2==0 && num%3==0 && num%5==0) {
                System.out.print(num + " ");
            }
            num++;
            count++;
        }
    }
}
