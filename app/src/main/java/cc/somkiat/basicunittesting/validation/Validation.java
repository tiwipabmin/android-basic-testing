package cc.somkiat.basicunittesting.validation;

/**
 * Created by tiwip on 11/15/2017.
 */

public abstract class Validation {

    private String errorMessage;
    private boolean result = true;

    public abstract void validation(String input);

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
}
