package cc.somkiat.basicunittesting.validation.emailValidation;

import cc.somkiat.basicunittesting.validation.Validation;

public class EmailIsEmpty extends Validation {

    @Override
    public void validation(String input) {
        if (input.isEmpty()) {
            setResult(false);
            setErrorMessage("Email is empty");
        }
    }
}
