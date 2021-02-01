package com.bridgeLabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmail {
    String emailRegex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
    public boolean validEmailId(String emailid){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
        boolean result = pattern.matcher(emailid).matches();
        return result;
    }
}
