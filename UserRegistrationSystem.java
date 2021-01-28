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
            System.out.println("last name is currect");
        else
            System.out.println("last name incurrect!!");
    }
    // creating a method for check the last name of the user
    void checkLastName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last name: ");
        String lastname = sc.nextLine();
        Pattern p = Pattern.compile("^[A-za-z]{3,}$"); // simple regex here
//        Matcher match = p.matcher("");
        Matcher match = p.matcher(lastname);
        boolean result = match.matches(); // boolean for this check result comes true or false statement
//        System.out.println(result);   // print result
        if (result == true)
            System.out.println("last name is currect");
        else
            System.out.println("last name incurrect!!");
    }

    void checkEmailId(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Email Id: ");
        String lastname = sc.nextLine();
        Pattern p = Pattern.compile("^(.+)@(.+)$"); // simple regex here
//        Matcher match = p.matcher("");
        Matcher match = p.matcher(lastname);
        boolean result = match.matches(); // boolean for this check result comes true or false statement
//        System.out.println(result);   // print result
        if (result == true)
            System.out.println("Email name is currect");
        else
            System.out.println("Email name incurrect!!");
    }

    public static void main(String[] args) {
        UserRegistrationSystem obj = new UserRegistrationSystem();
        obj.checkFastName();
        obj.checkLastName();
        obj.checkEmailId();
    }
}
