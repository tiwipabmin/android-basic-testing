package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.validation.Validation;
import cc.somkiat.basicunittesting.validation.nameValidation.NameContainSpecialAlphabetOrOther;
import cc.somkiat.basicunittesting.validation.nameValidation.NameIsEmpty;
import cc.somkiat.basicunittesting.validation.nameValidation.NameIsNull;
import cc.somkiat.basicunittesting.validation.nameValidation.NameIsNumeric;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class NameValidationFailTest {

    @Test
    public void nameIsEmpty() {
        Validation nameValidation = new NameIsEmpty();
        nameValidation.validation("");

        assertFalse(nameValidation.isResult());
        assertEquals("Name is empty", nameValidation.getErrorMessage());
    }

    @Test
    public void nameIsNull() {
        Validation nameValidation = new NameIsNull();
        nameValidation.validation(null);

        assertFalse(nameValidation.isResult());
        assertEquals("Name is null", nameValidation.getErrorMessage());
    }

    @Test
    public void nameIsNumeric(){
        Validation nameValidation = new NameIsNumeric();
        nameValidation.validation("126");

        assertFalse(nameValidation.isResult());
        assertEquals("Name is numeric", nameValidation.getErrorMessage());
    }

    @Test
    public void nameContainSpecialAlphabetOrOther(){
        Validation nameValidation = new NameContainSpecialAlphabetOrOther();
        nameValidation.validation("Millimeter!@#@#$#@$56498");

        assertFalse(nameValidation.isResult());
        assertEquals("Name contain special alphabet or other", nameValidation.getErrorMessage());
    }
}
