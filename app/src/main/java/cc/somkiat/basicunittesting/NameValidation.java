package cc.somkiat.basicunittesting;

import android.text.TextUtils;

import java.util.regex.Pattern;

/**
 * Created by tiwip on 11/14/2017.
 */

class NameValidation {

    private boolean result;
    private String errorMessage;

    public void nameValidationIsEmpty(String name) {
        if (name.isEmpty()) {
            result = false;
            errorMessage = "Name is empty";
        }
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public boolean isResult() {
        return result;
    }

    public void nameValidationIsNull(String name){
        if(name == null){
            result = false;
            errorMessage = "Name is null";
        }
    }

    public void nameValidationIsNumeric(String name){
        if(name.matches("^[0-9]+")){
            result = false;
            errorMessage = "Name is numeric";
        }
    }

    public void nameValidationContainSpecialAlphabetOrOther(String name){
        if(!name.matches("^[A-Za-z]+$")){
            result = false;
            errorMessage = "Name contain special alphabet or other";
        }
    }

    public void nameValidationIsLowercaseLetter(String name) {
        if(name.matches("^[a-z]+$")){
            result = true;
            errorMessage = "Name is lowercase letter";
        }
    }
}
