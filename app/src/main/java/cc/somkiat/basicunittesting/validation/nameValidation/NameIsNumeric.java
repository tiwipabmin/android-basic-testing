package cc.somkiat.basicunittesting.validation.nameValidation;

import cc.somkiat.basicunittesting.validation.Validation;

public class NameIsNumeric extends Validation {
    @Override
    public void validation(String input) {
        if(input.matches("^[0-9]+")){
            setResult(false);
            setErrorMessage("Name is numeric");
        }
    }
}
