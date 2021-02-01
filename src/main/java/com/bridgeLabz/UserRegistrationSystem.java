package com.bridgeLabz;

import java.util.regex.*;
import java.util.*;

public class UserRegistrationSystem {
    // creating a method for check the first name of the user
    void checkFastName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String firstname = sc.nextLine();
        System.out.println("Welcome to Registration System");
        Pattern p = Pattern.compile("^[A-za-z]{3,}$"); // simple regex here for check first name
//        Matcher match = p.matcher("");
        Matcher match = p.matcher(firstname);
        boolean result = match.matches(); // boolean for this check result comes true or false statement
//        System.out.println(result);   // print result
        if (result == true)
            System.out.println("last format is currect");
        else
            System.out.println("last format incurrect!!");
    }
    // creating a method for check the last name of the user
    void checkLastName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last name: ");
        String lastname = sc.nextLine();
        Pattern p = Pattern.compile("^[A-za-z]{3,}$"); // simple regex here for ceck last name
//        Matcher match = p.matcher("");
        Matcher match = p.matcher(lastname);
        boolean result = match.matches(); // boolean for this check result comes true or false statement
//        System.out.println(result);   // print result
        if (result == true)
            System.out.println("last format is currect");
        else
            System.out.println("last format incurrect!!");
    }

    void checkEmailId(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Email Id: ");
        String lastname = sc.nextLine();
        Pattern p = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"); // simple regex here for check all email id
//        Matcher match = p.matcher("");
        Matcher match = p.matcher(lastname);
        boolean result = match.matches(); // boolean for this check result comes true or false statement
//        System.out.println(result);   // print result
        if (result == true)
            System.out.println("Email format is currect");
        else
            System.out.println("Email format incurrect!!");
    }

    void checkphnumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ph number: ");
        String lastname = sc.nextLine();
        Pattern p = Pattern.compile("^[0-99]{2}[0-9]{10}"); // simple regex here for check phone number
//        Matcher match = p.matcher("");
        Matcher match = p.matcher(lastname);
        boolean result = match.matches(); // boolean for this check result comes true or false statement
//        System.out.println(result);   // print result
        if (result == true)
            System.out.println("Ph number format is currect");
        else
            System.out.println("Ph number format is incurrect!!");
    }

    void passwordCheck(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password: ");
        String lastname = sc.nextLine();
        Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])"); // simple regex here for check password format
//        Matcher match = p.matcher("");
        Matcher match = p.matcher(lastname);
        boolean result = match.matches(); // boolean for this check result comes true or false statement
//        System.out.println(result);   // print result
        if (result == true)
            System.out.println("password format is currect");
        else {
            System.out.println("Password format is incurrect!!");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserRegistrationSystem obj = new UserRegistrationSystem();
        System.out.println("1. Check First name");
        System.out.println("2. Check last name");
        System.out.println("3. Check Email id");
        System.out.println("4. Check phone number");
        System.out.println("5. Check password format");
        System.out.println("");
        System.out.print("Enter number ==> ");
        int chose = sc.nextInt();
        switch (chose)
        {
            case 1:
                obj.checkFastName();
                break;
            case 2:
                obj.checkLastName();
                break;
            case 3:
                obj.checkEmailId();
                break;
            case 4:
                obj.checkphnumber();
                break;
            case 5:
                obj.passwordCheck();
                break;
        }
    }
}


