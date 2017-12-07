package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.validation.emailValidation.EmailValidPattern;
import cc.somkiat.basicunittesting.validation.Validation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class EmailValidationPassTest {

    @Test
    public void emailInvalidPattern() {
        Validation emailValidation = new EmailValidPattern();
        emailValidation.validation("tiwipabmin@gmail.com");

        assertTrue(emailValidation.isResult());
        assertEquals("Email valid pattern", emailValidation.getErrorMessage());
    }
}
