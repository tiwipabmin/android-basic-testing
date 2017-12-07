package cc.somkiat.basicunittesting.validation.emailValidation;

import cc.somkiat.basicunittesting.validation.Validation;

public class EmailIsNull extends Validation {
    @Override
    public void validation(String input) {
        if(input == null) {
            setResult(false);
            setErrorMessage("Email is null");
        }
    }
}
