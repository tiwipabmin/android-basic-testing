package cc.somkiat.basicunittesting.validation.nameValidation;

import cc.somkiat.basicunittesting.validation.Validation;

/**
 * Created by tiwip on 11/15/2017.
 */

public class NameIsEmpty extends Validation {
    @Override
    public void validation(String input) {
        if (input.isEmpty()) {
            setResult(false);
            setErrorMessage("Name is empty");
        }
    }
}
