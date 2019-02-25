// Initialize an integer array with ascii values and print the corresponding character values in a single row.
public class arr4 {
    public static void main(String[] args)
    {
        int[] ascii = { 97,98,99,100,101,111,115 };
        int len=ascii.length;
        for(int i=0;i<len;i++)
        {

            System.out.print((char)ascii[i]+" ");
        }

    }
}
