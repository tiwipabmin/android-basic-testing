package cc.somkiat.basicunittesting;

/**
 * Created by tiwip on 11/15/2017.
 */

public class EmailValidation {

    private boolean result;
    private String errorMessage;

    public void emailValidationIsEmpty(String name) {
        if (name.isEmpty()) {
            result = false;
            errorMessage = "Email is empty";
        }
    }

    public boolean isResult() {
        return result;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
