package cc.somkiat.basicunittesting.validation.emailValidation;

import cc.somkiat.basicunittesting.validation.Validation;

public class EmailValidPattern extends Validation {
    @Override
    public void validation(String input) {
        if (input.matches("^[A-Za-z0-9]+[A-Za-z0-9_%+-]+@([A-Za-z]+)\\.([A-Za-z]{2,})$")) {
            setResult(true);
            setErrorMessage("Email valid pattern");
        }
    }
}
