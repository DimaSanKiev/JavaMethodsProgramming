package design_patterns._03_structural._02_decorator._02_starbuzz_example;

/**
 * Created by carmichael on 2016-03-12.
 */
public abstract class Beverage {
    private String description = "unknown Beverage";

    public String getDescription(){
        return description;
    }

    public void setDescription(String desc){
        description = desc;
    }

    public abstract double cost();
}
