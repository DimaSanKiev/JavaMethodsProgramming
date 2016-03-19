package design_patterns._03_structural._01_bridge._02_bank_example;

public abstract class Account {
    private int id;
    private double amount;
    private Action action;

    protected Account(Action action) {
        this.action = action;
    }

    public abstract boolean takeSum(double sum);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
}
