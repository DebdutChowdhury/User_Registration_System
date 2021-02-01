package com.bridgeLabz;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;


public class ValidEmailTest {
    private String emailid;
    private String expectedResult;

    public ValidEmailTest(String email, String expectedResult){
        this.emailid = email;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection data(){

        return Arrays.asList(new Object[][]{{"abc@yahoo.com"}, {"abc-100@yahoo.com"}, {"abc.100@yahoo.com"}, {"abc111@abc.com"}, {"abc-100@abc.net"},
                                            {"abc.100@abc.com.au"}, {"abc@1.com"}, {"abc@gmail.com.com"}, {"asbc+100@gmail.com"}, {"abc"},
                                            {"abc@"}
        });
    }

    @Test
    public void givenemail_whenproper_shouldreturnTrue() {
        ValidEmail vm = new ValidEmail();
        boolean result = vm.validEmailId(emailid);
        Assert.assertTrue(expectedResult,result);
    }
}
