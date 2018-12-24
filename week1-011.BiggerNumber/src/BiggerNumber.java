
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

System.out.print ("Type a number: ");
int number = Integer.parseInt (reader.nextLine ());

System.out.print ("Type another number: ");
int number2 = Integer.parseInt (reader.nextLine ());

int biggest = Math.max (number, number2);
        
System.out.print ("The biggest of the two numbers given was: " + biggest);

// Implement your program here. Remember to ask the input from user
    }
}
