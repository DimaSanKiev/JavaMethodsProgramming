package design_patterns._03_structural._02_decorator._02_starbuzz_example;

/**
 * Created by carmichael on 2016-03-12.
 */
public class StarbuzzCoffeeDemo {
    public static void main(String[] args){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "$" + beverage.cost());

        // double mocha,, dark roast coffee with whip cream
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + "$" + beverage.cost());

        // House blend with soy, mocha, and whip
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Mocha(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + "$" + beverage.cost());
    }
}
