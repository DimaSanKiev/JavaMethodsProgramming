package design_patterns._02_behavioral._05_mediator._02_phone_example;

public class PhoneSubscriber {
    private PhoneOperatorMediator phoneOperator;
    private long phoneNumber;

    public PhoneSubscriber(PhoneOperatorMediator phoneOperator) {
        this.phoneOperator = phoneOperator;
        this.phoneNumber = phoneOperator.generatePhoneNumber();
    }

    public boolean call(PhoneSubscriber otherPhoneSubscriber) {
        return phoneOperator.connect(this, otherPhoneSubscriber);
    }

    public boolean finishCall() {
        return phoneOperator.disconnect(this);
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "subscriber #" + phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {     // simplest
        if (obj != null && obj instanceof PhoneSubscriber) {
            return this.getPhoneNumber() == ((PhoneSubscriber) obj).getPhoneNumber();
        } else {
            return false;
        }
    }
}
