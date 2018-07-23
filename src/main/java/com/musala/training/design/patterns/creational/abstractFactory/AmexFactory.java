package com.musala.training.design.patterns.creational.abstractFactory;

public class AmexFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType type) {
        switch (type) {
            case GOLD : return new AmexGoldCreditCard();

            case PLATINIUM: return new AmexPlatiniumCreditCard();

            default: break;
        }
        return null;
    }

    @Override
    public Validator getValidator(CardType type) {
        switch (type) {
            case GOLD : return new AmexGoldValidator();

            case PLATINIUM: return new AmexPlatiniumValidator();

            default: break;
        }
        return null;
    }
}
