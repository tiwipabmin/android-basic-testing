package cc.somkiat.basicunittesting;

/**
 * Created by tiwip on 11/15/2017.
 */

public class EmailValidation {

    private boolean result;
    private String errorMessage;

    public void emailValidationIsEmpty(String email) {
        if (email.isEmpty()) {
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

    public void emailValidationIsNull(String email) {
        if (email == null) {
            result = false;
            errorMessage = "Email is null";
        }
    }
}
