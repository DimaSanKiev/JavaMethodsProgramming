package design_patterns._02_behavioral._07_state._04_pay_example_3;

public class PurchasedState implements IPayState {
    @Override
    public void check(Order order) {
        // check
        System.out.println("Paid order was checked.");
    }

    @Override
    public void purchase(Order order) {
        // payment
        System.out.println("Order was paid.");
    }
}
