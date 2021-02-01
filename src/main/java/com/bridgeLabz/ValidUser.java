package com.bridgeLabz;

import java.util.regex.Pattern;

public class ValidUser {
    private static String firstNameRegex = "^[A-za-z]{3,}$";
    private static String lastNameRegex = "^[A-za-z]{3,}$";
    private static String emailIdRegex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
    private static String phnumberRegex = "^[0-99]{2}[0-9]{10}";
    private static String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])";

    public boolean validFirstName(String firstName){
        Pattern pattern = Pattern.compile(firstName);
        boolean result = pattern.matcher(firstName).matches();
        return result;
    }

    public boolean validLastName(String lastName){
        Pattern pattern = Pattern.compile(lastName);
        boolean result = pattern.matcher(lastName).matches();
        return result;
    }

    public boolean validEmailId(String emailid){
        Pattern pattern = Pattern.compile(emailid);
        boolean result = pattern.matcher(emailid).matches();
        return result;
    }

    public boolean validPhNumber(String phnumber){
        Pattern pattern = Pattern.compile(phnumber);
        boolean result = pattern.matcher(phnumber).matches();
        return result;
    }

    public boolean validPassword(String password){
        Pattern pattern = Pattern.compile(password);
        boolean result = pattern.matcher(password).matches();
        return result;
    }
}
