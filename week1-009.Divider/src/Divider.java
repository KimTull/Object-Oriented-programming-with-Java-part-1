
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
    System.out.print ("Type a number: ");
    int number = Integer.parseInt (reader.nextLine ());
    
    System.out.print ("Type another number: ");
    int number2 = Integer.parseInt (reader.nextLine ());
    
    double div = (double) number / number2;
    
    String toPrint = "Division:" + number + "/" +number2 + "=" + div;
    System.out.println (toPrint);

        // Implement your program here. Remember to ask the input from user.
    }
}
