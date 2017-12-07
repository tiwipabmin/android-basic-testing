package cc.somkiat.basicunittesting.validation.nameValidation;

import cc.somkiat.basicunittesting.validation.Validation;

public class NameIsAlphabet extends Validation {
    @Override
    public void validation(String input) {
        if(input.matches("^[A-Za-z]+$")){
            setResult(true);
            setErrorMessage("Name is alphabet");
        }
    }
}
