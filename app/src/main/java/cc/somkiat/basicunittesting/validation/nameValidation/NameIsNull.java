package cc.somkiat.basicunittesting.validation.nameValidation;

import cc.somkiat.basicunittesting.validation.Validation;

/**
 * Created by tiwip on 11/15/2017.
 */

public class NameIsNull extends Validation {
    @Override
    public void validation(String input) {
        if(input == null){
            setResult(false);
            setErrorMessage("Name is null");
        }
    }
}
