package log4j._01_basic;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class DemoLogProp {
    static {
        PropertyConfigurator.configure("src/main/resources/log4j.properties");
    }

    private static Logger logger = Logger.getLogger(DemoLogProp.class);

    public static void main(String[] args) {
        try {
            DemoLog.factorial(9);
            DemoLog.factorial(-3);
        } catch (IllegalArgumentException e) {

            // log ERROR level
            logger.error("negative argument: ", e);
        }
    }

}
