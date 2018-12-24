
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        while (true) {
        System.out.println("Give a number: ");
        double number = Double.parseDouble (reader.nextLine ());
        if (number > -29 && number < 41) {
        Graph.addNumber (number);    
        } else {
            System.out.println("Try agian"); 
        }
            
        }
        

        // Graph is used as follows:
        //Graph.addNumber(7);
        //double value = 13.5;
        //Graph.addNumber(value);
        //value = 3;
        //Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }
}