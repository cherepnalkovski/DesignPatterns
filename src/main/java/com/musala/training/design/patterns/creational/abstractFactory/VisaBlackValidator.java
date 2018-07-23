package com.musala.training.design.patterns.creational.abstractFactory;

public class VisaBlackValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
