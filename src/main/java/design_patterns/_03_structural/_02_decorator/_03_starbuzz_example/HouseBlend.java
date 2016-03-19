package design_patterns._03_structural._02_decorator._03_starbuzz_example;

/**
 * Created by carmichael on 2016-03-12.
 */
public class HouseBlend extends Beverage {
    public HouseBlend(){
        setDescription("House Blend Coffee");
    }

    @Override
    public double cost() {
        return .89;
    }
}
