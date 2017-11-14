package cc.somkiat.basicunittesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by tiwip on 11/15/2017.
 */

public class EmailValidationFailTest {

    @Test
    public void emailIsEmpty() {
        EmailValidation emailValidation = new EmailValidation();
        emailValidation.emailValidationIsEmpty("");

        assertFalse(emailValidation.isResult());
        assertEquals("Email is empty", emailValidation.getErrorMessage());
    }

    @Test
    public void emailIsNull() {
        EmailValidation emailValidation = new EmailValidation();
        emailValidation.emailValidationIsNull(null);

        assertFalse(emailValidation.isResult());
        assertEquals("Email is null", emailValidation.getErrorMessage());
    }

    @Test
    public void emailInvalidPattern() {
        EmailValidation emailValidation = new EmailValidation();
        emailValidation.emailValidationInvalidPattern("tiwipabmin!@gmail.com");

        assertFalse(emailValidation.isResult());
        assertEquals("Email invalid pattern", emailValidation.getErrorMessage());
    }
}
