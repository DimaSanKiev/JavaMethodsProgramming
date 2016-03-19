package design_patterns._03_structural._01_bridge._02_bank_example;

public class RegularAction extends Action {
    private final static int MAX_SUM = 100;         // read from base
    private final static int NORMAL_INTEREST = 3;   // read from base

    @Override
    public double changeInterest() {
        // change NORMAL interest on account
        return NORMAL_INTEREST;
    }

    @Override
    public double defineMaxSum() {
        // max sum is unbounded
        return MAX_SUM;
    }

    @Override
    public double increasePayment() {
        return 0;   // stub
    }
}
