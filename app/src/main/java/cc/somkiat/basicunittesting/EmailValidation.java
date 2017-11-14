package cc.somkiat.basicunittesting;

import android.text.TextUtils;
import android.util.Patterns;


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

    public void emailValidationInvalidPattern(String email) {
        if (!email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
            result = false;
            errorMessage = "Email invalid pattern";
        }
    }

    public void emailValidationValidPattern(String email) {
        if (email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$") && !email.isEmpty()) {
            result = true;
            errorMessage = "Email valid pattern";
        }
    }
}
