package design_patterns._03_structural._01_bridge._02_bank_example;

public class CreditAccount extends Account {
    private double limitCredit;

    public CreditAccount(Action action) {
        super(action);
    }

    @Override
    public boolean takeSum(double sum) {
        System.out.println("Performing by credit account:");
        double payment = getAction().increasePayment();
        double maxSum = getAction().defineMaxSum();
        // check amount
        System.out.println("accountID: " + getId() + " : increase monthly payments: " + payment);
        System.out.println(": recording of changes in the state accounts");
        System.out.println(": withdrawal : " + sum);
        return true;
    }

    public double getLimitCredit() {
        return limitCredit;
    }

    public void setLimitCredit(double limitCredit) {
        this.limitCredit = limitCredit;
    }
}
