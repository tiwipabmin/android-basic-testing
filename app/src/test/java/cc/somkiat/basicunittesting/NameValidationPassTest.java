package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.validation.Validation;
import cc.somkiat.basicunittesting.validation.nameValidation.NameIsAlphabet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NameValidationPassTest {

    @Test
    public void nameIsAlphabet() {
        Validation nameValidation = new NameIsAlphabet();
        nameValidation.validation("Millimeter");

        assertTrue(nameValidation.isResult());
        assertEquals("Name is alphabet", nameValidation.getErrorMessage());
    }
}
