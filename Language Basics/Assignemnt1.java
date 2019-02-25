
// Write a Program that accepts two Strings as command line arguments and generate the output in the required format. 

// Example:

// If the two command line arguments are Wipro and Bangalore then the output generated should be Wipro Technologies Bangalore.

// If the command line arguments are ABC and Mumbai then the output generated should be ABC Technologies Mumbai 

// [Note: It is mandatory to pass two arguments in command line]

public class Assignemnt1{
    public static void main(String[] args){
        System.out.println(args[0]);
        System.out.println(args[1]);
        if(args[0].equals("Wipro") && args[1].equals("Bangalore"))
        {
            System.out.println(args[0]+" Technologies "+args[1]);
        }
        if(args[0].equals("ABC") && args[1].equals("Mumbai"))
        {
            System.out.println(args[0]+"Technologies"+args[1]);
        }
    }
}