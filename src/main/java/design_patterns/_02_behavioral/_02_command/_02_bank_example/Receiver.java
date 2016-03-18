package design_patterns._02_behavioral._02_command._02_bank_example;

public class Receiver {
    private Account account;
    private double amount;
    private static final double INTEREST_RATE = 9.5;    // must be get from outside

    public Receiver(Account account) {
        this.account = account;
    }

    public void action(CommandTypes cmd) {
        switch (cmd) {
            case CREDITING:     // CREDITING operation implementation
                if (account.isBlocked()) {
                    System.out.println("Sorry, the account #" + account.getId()
                            + " is blocked! You can't credit charges to it");
                } else {
                    double balance = account.getBalance();
                    balance *= INTEREST_RATE * 0.01;
                    account.setBalance(balance);
                    System.out.println("Crediting is performed with "
                            + INTEREST_RATE + " % interest rate to account # " + account.getId());
                }
                break;
            case WITHDRAWING:    // WITHDRAWING operation implementation
                if (account.isBlocked()) {
                    System.out.println("Sorry, the account #" + account.getId()
                            + " is blocked! You can't withdraw money");
                } else {
                    double balance = account.getBalance();
                    balance -= amount;
                    account.setBalance(balance);
                    System.out.println(amount + " was withdrawn from the account #" + account.getId());
                }
                break;
            case BLOCKING:    // BLOCKING operation implementation
                if (account.isBlocked()) {
                    account.setBlocked(false);
                    System.out.println("The account #" + account.getId() + " is unblocked");
                } else {
                    account.setBlocked(true);
                    System.out.println("The account #" + account.getId() + " is blocked");
                }
                break;
        }
    }
}
