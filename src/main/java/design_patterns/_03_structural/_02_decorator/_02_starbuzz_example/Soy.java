package design_patterns._03_structural._02_decorator._02_starbuzz_example;

/**
 * Created by carmichael on 2016-03-12.
 */
public class Soy extends CondimentDecorator{
    private Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
