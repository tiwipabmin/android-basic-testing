package cc.somkiat.basicunittesting.validation.nameValidation;

import cc.somkiat.basicunittesting.validation.Validation;

/**
 * Created by tiwip on 11/15/2017.
 */

public class NameContainSpecialAlphabetOrOther extends Validation {
    @Override
    public void validation(String input) {
        if(!input.matches("^[A-Za-z]+$")){
            setResult(false);
            setErrorMessage("Name contain special alphabet or other");
        }
    }
}
