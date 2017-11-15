package cc.somkiat.basicunittesting.validation.emailValidation;

import cc.somkiat.basicunittesting.validation.Validation;

/**
 * Created by tiwip on 11/15/2017.
 */

public class EmailIsEmpty extends Validation {

    @Override
    public void validation(String input) {
        if (input.isEmpty()) {
            setResult(false);
            setErrorMessage("Email is empty");
        }
    }
}
