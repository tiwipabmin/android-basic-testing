package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.validation.Validation;
import cc.somkiat.basicunittesting.validation.nameValidation.NameIsAlphabet;
import cc.somkiat.basicunittesting.validation.nameValidation.NameIsLowercaseLetter;
import cc.somkiat.basicunittesting.validation.nameValidation.NameIsUppercaseLetter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by tiwip on 11/15/2017.
 */

public class NameValidationPassTest {

    @Test
    public void nameIsLowercaseLetter() {
        Validation nameValidation = new NameIsLowercaseLetter();
        nameValidation.validation("millimeter");

        assertTrue(nameValidation.isResult());
        assertEquals("Name is lowercase letter", nameValidation.getErrorMessage());
    }

    @Test
    public void nameIsUppercaseLetter() {
        Validation nameValidation = new NameIsUppercaseLetter();
        nameValidation.validation("MILLIMETER");

        assertTrue(nameValidation.isResult());
        assertEquals("Name is uppercase letter", nameValidation.getErrorMessage());
    }

    @Test
    public void nameIsAlphabet() {
        Validation nameValidation = new NameIsAlphabet();
        nameValidation.validation("Millimeter");

        assertTrue(nameValidation.isResult());
        assertEquals("Name is alphabet", nameValidation.getErrorMessage());
    }
}
