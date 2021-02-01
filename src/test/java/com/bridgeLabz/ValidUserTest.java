package com.bridgeLabz;

import org.junit.Assert;
import org.junit.Test;

public class ValidUserTest {
    ValidUser vt = new ValidUser();

    @Test
    public void firstnamegivenHappy() {
        boolean result = vt.validFirstName("Debdut");
        Assert.assertTrue(result);
    }

    @Test
    public void firstnamegivenSad() {
        boolean result = vt.validFirstName("Debdut");
        Assert.assertTrue(result);
    }

    @Test
    public void lastnamegivenHappy() {
        boolean result = vt.validLastName("Chowdhury");
        Assert.assertTrue(result);
    }

    @Test
    public void lastnamegivenSad() {
        boolean result = vt.validLastName("chowdhury");
        Assert.assertTrue(result);
    }

    @Test
    public void emailidgivenHappy() {
        boolean result = vt.validEmailId("debdut.chowdhury@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void emailidgivenSad() {
        boolean result = vt.validEmailId("debdut.chowdhurygmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void phnumbergivenHappy() {
        boolean result = vt.validPhNumber("919876546783");
        Assert.assertTrue(result);
    }

    @Test
    public void phnumbergivenSad() {
        boolean result = vt.validPhNumber("91987654678");
        Assert.assertTrue(result);
    }

    @Test
    public void passwordgivenHappy() {
        boolean result = vt.validPassword("Ssdjkfsdf34@bdsf");
        Assert.assertTrue(result);
    }

    @Test
    public void passwordgivenSad() {
        boolean result = vt.validPassword("Sfhudofh324bsdfd");
        Assert.assertTrue(result);
    }
}
