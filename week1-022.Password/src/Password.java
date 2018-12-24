
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; 
       
        while (true) {
        System.out.println("Type the password: ");
        String givenPassword = reader.nextLine ();
        if (givenPassword.equals (password)) {
            System.out.println("Right!"); 
            System.out.println("The secret is: bananas!!");
            break;
        } 
        else {
            System.out.println("Wrong!");
        }
        }
    }
}
