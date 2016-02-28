package design_patterns._02_behavioral._03_command._02_bank_example;

public class Account {
    private int id;
    private double balance;
    private boolean blocked;

    public Account(int id, double balance, boolean blocked) {
        this.id = id;
        this.balance = balance;
        this.blocked = blocked;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
}
