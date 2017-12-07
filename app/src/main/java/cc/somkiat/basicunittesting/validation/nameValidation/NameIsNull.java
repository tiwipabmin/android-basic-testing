package cc.somkiat.basicunittesting.validation.nameValidation;

import cc.somkiat.basicunittesting.validation.Validation;

public class NameIsNull extends Validation {
    @Override
    public void validation(String input) {
        if(input == null){
            setResult(false);
            setErrorMessage("Name is null");
        }
    }
}
