
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print ("Type the radius: ");
        int rad = Integer.parseInt (reader.nextLine ());
        
        double circle = (double) 2 * Math.PI * rad;
        
        System.out.print ("Circumstances of the circle: " + circle);
        
        
        // Program your solution here 
    }
}
