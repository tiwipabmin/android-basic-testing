package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.validation.emailValidation.EmailValidPattern;
import cc.somkiat.basicunittesting.validation.Validation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by tiwip on 11/15/2017.
 */

public class EmailValidationPassTest {

    @Test
    public void emailInvalidPattern() {
        Validation emailValidation = new EmailValidPattern();
        emailValidation.validation("tiwipabmin@gmail.com");

        assertTrue(emailValidation.isResult());
        assertEquals("Email valid pattern", emailValidation.getErrorMessage());
    }
}
