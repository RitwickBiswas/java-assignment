import java.util.Scanner;
//Write a program to add all the values in a given number and print. Ex: 1234->10
public class sumDigit {
    public static void main(String[] args)
    {
        System.out.println("Enter a Number");
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        int retainNum=num;
        int sum=0;
        while(num!=0)
        {
            sum=sum+num%10;
            num=num/10;
        }
        System.out.println(retainNum+" -> "+ sum);
    }
}
