package cc.somkiat.basicunittesting;

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
}
