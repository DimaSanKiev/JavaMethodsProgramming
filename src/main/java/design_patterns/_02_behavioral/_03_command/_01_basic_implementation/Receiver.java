package design_patterns._02_behavioral._03_command._01_basic_implementation;

public class Receiver {
    public void action(TypeCommand cmd) {
        switch (cmd) {
            case ONE:
                System.out.println("Know the information to complete request One");
                break;
            case TWO:
                System.out.println("Know the information to complete request Two");
                break;
        }
    }
}
