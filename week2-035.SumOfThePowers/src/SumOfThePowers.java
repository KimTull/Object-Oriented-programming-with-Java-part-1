
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = Integer.parseInt (reader.nextLine ());
        
        int n = 0;
        int result = 0;
        
        while (n <= number) {
           result += (int)Math.pow(2,n);
           n++;
        }
        System.out.println("The result is" + result);
       
    }
}
