
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what? ");
        int number = Integer.parseInt (reader.nextLine ());
        
        int n = 1;
        int sum = 0;
        while (n <= number){
            sum += n;
            n ++;
        }
    
        System.out.println("Sum is " + sum);
    }
}
