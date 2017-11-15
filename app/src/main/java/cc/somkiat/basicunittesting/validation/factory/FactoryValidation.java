package cc.somkiat.basicunittesting.validation.factory;

import java.util.ArrayList;

import cc.somkiat.basicunittesting.validation.Validation;
import cc.somkiat.basicunittesting.validation.emailValidation.EmailInvalidPattern;
import cc.somkiat.basicunittesting.validation.emailValidation.EmailIsEmpty;
import cc.somkiat.basicunittesting.validation.emailValidation.EmailIsNull;
import cc.somkiat.basicunittesting.validation.emailValidation.EmailValidPattern;
import cc.somkiat.basicunittesting.validation.nameValidation.NameContainSpecialAlphabetOrOther;
import cc.somkiat.basicunittesting.validation.nameValidation.NameIsAlphabet;
import cc.somkiat.basicunittesting.validation.nameValidation.NameIsEmpty;
import cc.somkiat.basicunittesting.validation.nameValidation.NameIsLowercaseLetter;
import cc.somkiat.basicunittesting.validation.nameValidation.NameIsNull;
import cc.somkiat.basicunittesting.validation.nameValidation.NameIsNumeric;
import cc.somkiat.basicunittesting.validation.nameValidation.NameIsUppercaseLetter;

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
        factory.add(new NameContainSpecialAlphabetOrOther());
        factory.add(new NameIsAlphabet());
        factory.add(new NameIsEmpty());
        factory.add(new NameIsLowercaseLetter());
        factory.add(new NameIsNull());
        factory.add(new NameIsNumeric());
        factory.add(new NameIsUppercaseLetter());
    }

    public ArrayList<Validation> getFactory() {
        return factory;
    }
}
