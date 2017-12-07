package cc.somkiat.basicunittesting.validation.factory;

import java.util.ArrayList;

import cc.somkiat.basicunittesting.validation.Validation;
import cc.somkiat.basicunittesting.validation.nameValidation.NameContainSpecialAlphabetOrOther;
import cc.somkiat.basicunittesting.validation.nameValidation.NameIsAlphabet;
import cc.somkiat.basicunittesting.validation.nameValidation.NameIsEmpty;
import cc.somkiat.basicunittesting.validation.nameValidation.NameIsNull;
import cc.somkiat.basicunittesting.validation.nameValidation.NameIsNumeric;


public class FactoryNameValidation {

    private ArrayList<Validation> factory;

    public FactoryNameValidation(){

        factory = new ArrayList<>();
        factory.add(new NameIsAlphabet());
        factory.add(new NameIsEmpty());
        factory.add(new NameIsNull());
        factory.add(new NameIsNumeric());
        factory.add(new NameContainSpecialAlphabetOrOther());
    }

    public ArrayList<Validation> getFactory() {
        return factory;
    }
}
