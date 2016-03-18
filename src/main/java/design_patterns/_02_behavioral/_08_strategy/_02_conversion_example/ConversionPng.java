package design_patterns._02_behavioral._08_strategy._02_conversion_example;

import java.net.URL;

public class ConversionPng implements Conversion {
    @Override
    public void convert(URL urlFileImage) {
        System.out.println("PNG conversion");
    }
}
