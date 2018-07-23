package design.patterns.creational.abstractFactory;

public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType type) {
        switch (type) {
            case GOLD : return new VisaGoldCreditCard();

            case BLACK: return new VisaBlackCreditCard();

            default: break;
        }
        return null;
    }

    @Override
    public Validator getValidator(CardType type) {
        switch (type) {
            case GOLD : return new VisaGoldValidator();

            case BLACK: return new VisaBlackValidator();

            default: break;
        }
        return null;
    }
}
