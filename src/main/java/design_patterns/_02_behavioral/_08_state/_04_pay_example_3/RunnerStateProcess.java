package design_patterns._02_behavioral._08_state._04_pay_example_3;

public class RunnerStateProcess {
    public static void main(String[] args) {
        Order order = new Order(1000, 14);
        order.checked();
        order.setDays(-1);
        order.checked();
        order.purchased();
        order.checked();
    }
}
