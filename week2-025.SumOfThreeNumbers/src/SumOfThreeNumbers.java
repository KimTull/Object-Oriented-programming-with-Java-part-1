
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; 

        
        System.out.println("Type the first number: ");
        sum = Integer.parseInt (reader.nextLine ());
       
        
        System.out.println("Type the second number:");
        sum += Integer.parseInt (reader.nextLine ());
       
        
        System.out.println("Type the third number: ");
        sum += Integer.parseInt (reader.nextLine ());
       
        
        System.out.println("Sum: " + sum);
    }
}
