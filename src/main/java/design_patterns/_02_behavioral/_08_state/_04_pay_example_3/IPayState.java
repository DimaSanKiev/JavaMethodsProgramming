package design_patterns._02_behavioral._08_state._04_pay_example_3;

public interface IPayState {
    void check(Order order);

    void purchase(Order order);
}
