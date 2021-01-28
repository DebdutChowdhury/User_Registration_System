import java.util.regex.*;
import java.util.*;

public class UserRegistrationSystem {
    // creating a method for check the first name of the user
    void checkFastName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String firstname = sc.nextLine();
        System.out.println("Welcome to Registration System");
        Pattern p = Pattern.compile("^[A-za-z]{3,}$"); // simple regex here
//        Matcher match = p.matcher("");
        Matcher match = p.matcher(firstname);
        boolean result = match.matches(); // boolean for this check result comes true or false statement
//        System.out.println(result);   // print result
        if (result == true)
            System.out.println("First name is currect");
        else
            System.out.println("First name incurrect!!");
    }

    public static void main(String[] args) {
        UserRegistrationSystem obj = new UserRegistrationSystem();
        obj.checkFastName();
    }
}
