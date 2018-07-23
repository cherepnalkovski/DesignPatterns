package com.musala.training.design.patterns.creational.abstractFactory;

public class AmexPlatiniumValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
