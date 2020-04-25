package tugasmodul5kel37;
import java.util.Scanner;

public class TugasModul5Kel37 {

    public static void main(String[] args) {
        String email, password;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Email : ");
        email = input.nextLine();
        System.out.print("Password : ");
        password = input.nextLine();
        
        userService object = new userService( email, password );
        object.login();
    }
    
}
