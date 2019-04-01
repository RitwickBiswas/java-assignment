import java.util.Scanner;

public class arr11 {
    public static void main(String[] args)
    {
        System.out.println("Enter 2D array Size:");
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int[][] a = new int[row][col];
        for(int i = 0; i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                a[i][j]=scan.nextInt();
            }
        }
        int max = a[0][0];
        for(int i = 0; i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(a[i][j]>max)
                {
                    max=a[i][j];
                }
            }
        }
        System.out.println("Max Element is: "+max);

    }
}
