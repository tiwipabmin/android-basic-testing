package cc.somkiat.basicunittesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by tiwip on 11/15/2017.
 */

public class NameValidationPassTest {

    @Test
    public void nameIsLowercaseLetter() {
        NameValidation nameValidation = new NameValidation();
        nameValidation.nameValidationIsLowercaseLetter("millimeter");

        assertTrue(nameValidation.isResult());
        assertEquals("Name is lowercase letter", nameValidation.getErrorMessage());
    }

    @Test
    public void nameIsUppercaseLetter() {
        NameValidation nameValidation = new NameValidation();
        nameValidation.nameValidationIsUppercaseLetter("MILLIMETER");

        assertTrue(nameValidation.isResult());
        assertEquals("Name is uppercase letter", nameValidation.getErrorMessage());
    }
}
