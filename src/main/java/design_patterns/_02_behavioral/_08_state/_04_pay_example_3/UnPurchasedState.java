package design_patterns._02_behavioral._08_state._04_pay_example_3;

public class UnPurchasedState implements IPayState {
    @Override
    public void check(Order order) {
        double percent;
        if (order.getDays() <= 0) {
            percent = order.getCost() * order.PERCENT;
            order.setCost(order.getCost() + percent);
            // not paid in time - added fine
            System.out.println("Order wasn't paid: fine is -> " + percent);
        }
    }

    @Override
    public void purchase(Order order) {
        order.setCurrentOrderState(new PurchasedState());
    }
}
