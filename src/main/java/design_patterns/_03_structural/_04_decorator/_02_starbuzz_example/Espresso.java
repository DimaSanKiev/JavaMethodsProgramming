package design_patterns._03_structural._04_decorator._02_starbuzz_example;

/**
 * Created by carmichael on 2016-03-12.
 */
public class Espresso extends Beverage{
    public Espresso(){
        setDescription("Espresso");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
