package cc.somkiat.basicunittesting.validation.factory;

import java.util.ArrayList;

import cc.somkiat.basicunittesting.validation.Validation;
import cc.somkiat.basicunittesting.validation.emailValidation.EmailInvalidPattern;
import cc.somkiat.basicunittesting.validation.emailValidation.EmailIsEmpty;
import cc.somkiat.basicunittesting.validation.emailValidation.EmailIsNull;
import cc.somkiat.basicunittesting.validation.emailValidation.EmailValidPattern;

public class FactoryEmailValidation {

    private ArrayList<Validation> factory;

    public FactoryEmailValidation(){

        factory = new ArrayList<>();
        factory.add(new EmailValidPattern());
        factory.add(new EmailIsEmpty());
        factory.add(new EmailIsNull());
        factory.add(new EmailInvalidPattern());
    }

    public ArrayList<Validation> getFactory() {
        return factory;
    }
}
