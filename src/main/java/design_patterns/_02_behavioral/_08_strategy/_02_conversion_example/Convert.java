package design_patterns._02_behavioral._08_strategy._02_conversion_example;

import java.net.URL;

public class Convert {
    private Conversion conversion;

    public Convert(Conversion conversion) {
        this.conversion = conversion;
    }

    public void convert(URL fileImg) {
        conversion.convert(fileImg);
    }
}
