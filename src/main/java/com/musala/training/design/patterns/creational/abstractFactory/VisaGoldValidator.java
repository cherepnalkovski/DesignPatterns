package com.musala.training.design.patterns.creational.abstractFactory;

public class VisaGoldValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
