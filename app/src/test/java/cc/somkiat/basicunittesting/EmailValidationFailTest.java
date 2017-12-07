package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.validation.emailValidation.EmailInvalidPattern;
import cc.somkiat.basicunittesting.validation.emailValidation.EmailIsEmpty;
import cc.somkiat.basicunittesting.validation.emailValidation.EmailIsNull;
import cc.somkiat.basicunittesting.validation.Validation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class EmailValidationFailTest {

    @Test
    public void emailIsEmpty() {
        Validation emailValidation = new EmailIsEmpty();
        emailValidation.validation("");

        assertFalse(emailValidation.isResult());
        assertEquals("Email is empty", emailValidation.getErrorMessage());
    }

    @Test
    public void emailIsNull() {
        Validation emailValidation = new EmailIsNull();
        emailValidation.validation(null);

        assertFalse(emailValidation.isResult());
        assertEquals("Email is null", emailValidation.getErrorMessage());
    }

    @Test
    public void emailInvalidPattern() {
        Validation emailValidation = new EmailInvalidPattern();
        emailValidation.validation("tiwipabmin!@gmail.com");

        assertFalse(emailValidation.isResult());
        assertEquals("Email invalid pattern", emailValidation.getErrorMessage());
    }
}
