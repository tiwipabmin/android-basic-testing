package cc.somkiat.basicunittesting.validation;

import java.util.ArrayList;

import cc.somkiat.basicunittesting.validation.emailValidation.EmailInvalidPattern;
import cc.somkiat.basicunittesting.validation.emailValidation.EmailIsEmpty;
import cc.somkiat.basicunittesting.validation.emailValidation.EmailIsNull;
import cc.somkiat.basicunittesting.validation.emailValidation.EmailValidPattern;

/**
 * Created by tiwip on 11/15/2017.
 */

public class FactoryValidation {

    private ArrayList<Validation> factory;

    public FactoryValidation(){

        factory = new ArrayList<>();
        factory.add(new EmailIsEmpty());
        factory.add(new EmailIsNull());
        factory.add(new EmailInvalidPattern());
        factory.add(new EmailValidPattern());
    }

    public ArrayList<Validation> getFactory() {
        return factory;
    }
}
