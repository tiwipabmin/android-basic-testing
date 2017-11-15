package cc.somkiat.basicunittesting.validation.emailValidation;

import cc.somkiat.basicunittesting.validation.Validation;

/**
 * Created by tiwip on 11/15/2017.
 */

public class EmailValidPattern extends Validation {
    @Override
    public void validation(String input) {
        if (input.matches("^[A-Za-z0-9]+[A-Za-z0-9_%+-]+@([A-Za-z]+)\\.([A-Za-z]{2,})$") && !input.isEmpty()) {
            setResult(true);
            setErrorMessage("Email valid pattern");
        }
    }
}
