package design_patterns._02_behavioral._04_mediator._02_phone_example;

public class RunnerPhoneMediator {
    public static void main(String[] args) {
        PhoneOperatorMediator phoneOperator = new ConcretePhoneOperatorMediator();
        PhoneSubscriber ps1 = new PhoneSubscriber(phoneOperator);
        PhoneSubscriber ps2 = new PhoneSubscriber(phoneOperator);
        PhoneSubscriber ps3 = new PhoneSubscriber(phoneOperator);
        PhoneSubscriber ps4 = new PhoneSubscriber(phoneOperator);
        phoneOperator.addPhoneSubscriber(ps1);
        phoneOperator.addPhoneSubscriber(ps2);
        phoneOperator.addPhoneSubscriber(ps3);
        phoneOperator.addPhoneSubscriber(ps4);

        // two subscribers call on one number
        ps1.call(ps2);
        ps3.call(ps2);

        // end of call and retry
        ps2.finishCall();
        ps3.call(ps2);

        // call of unregistered subscriber
        ps4.call(ps1);
    }
}
