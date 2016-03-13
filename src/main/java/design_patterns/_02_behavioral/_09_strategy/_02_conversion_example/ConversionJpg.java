package design_patterns._02_behavioral._09_strategy._02_conversion_example;

import java.net.URL;

public class ConversionJpg implements Conversion {
    @Override
    public void convert(URL urlFileImage) {
        System.out.println("JPG conversion");
    }
}
