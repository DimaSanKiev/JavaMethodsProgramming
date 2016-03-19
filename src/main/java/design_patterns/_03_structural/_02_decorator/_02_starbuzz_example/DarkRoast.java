package design_patterns._03_structural._02_decorator._02_starbuzz_example;

/**
 * Created by carmichael on 2016-03-12.
 */
public class DarkRoast extends Beverage {
    public DarkRoast(){
        setDescription("Dark Roast Coffee");
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
