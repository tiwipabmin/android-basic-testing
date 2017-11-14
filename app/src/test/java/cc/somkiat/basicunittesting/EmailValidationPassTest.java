package cc.somkiat.basicunittesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by tiwip on 11/15/2017.
 */

public class EmailValidationPassTest {

    @Test
    public void emailInvalidPattern() {
        EmailValidation emailValidation = new EmailValidation();
        emailValidation.emailValidationValidPattern("tiwipabmin@gmail.com");

        assertTrue(emailValidation.isResult());
        assertEquals("Email valid pattern", emailValidation.getErrorMessage());
    }
}
