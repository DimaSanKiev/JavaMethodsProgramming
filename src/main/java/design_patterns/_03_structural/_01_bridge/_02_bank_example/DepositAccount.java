package design_patterns._03_structural._01_bridge._02_bank_example;

public class DepositAccount extends Account {
    public DepositAccount(Action action) {
        super(action);
    }

    @Override
    public boolean takeSum(double sum) {
        System.out.println("Performing by deposit account:");
        double interest = getAction().changeInterest();
        double maxSum = getAction().defineMaxSum();
        // check amount
        System.out.println("accountID: " + getId() + " : interest is " + interest);
        System.out.println(": recording of changes in the state accounts");
        System.out.println(": withdrawal : " + sum);
        return true;
    }
}
