package cc.somkiat.basicunittesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by tiwip on 11/14/2017.
 */

public class NameValidationFailTest {

    @Test
    public void nameIsEmpty() {
        NameValidation nameValidation = new NameValidation();
        nameValidation.nameValidationIsEmpty("");

        assertFalse(nameValidation.isResult());
        assertEquals("Name is empty", nameValidation.getErrorMessage());
    }

    @Test
    public void nameIsNull() {
        NameValidation nameValidation = new NameValidation();
        nameValidation.nameValidationIsNull(null);

        assertFalse(nameValidation.isResult());
        assertEquals("Name is null", nameValidation.getErrorMessage());
    }
}
