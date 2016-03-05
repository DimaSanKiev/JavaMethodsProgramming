package design_patterns._02_behavioral._05_mediator._02_phone_example;

public interface PhoneOperatorMediator {
    long generatePhoneNumber();

    void addPhoneSubscriber(PhoneSubscriber ps);

    boolean isSupported(PhoneSubscriber ps);

    boolean connect(PhoneSubscriber ps1, PhoneSubscriber ps2);

    boolean disconnect(PhoneSubscriber ps1);
}
