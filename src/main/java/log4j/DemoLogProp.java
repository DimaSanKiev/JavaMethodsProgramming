package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class DemoLogProp {
    {
        PropertyConfigurator.configure("log4j.properties");
    }

    private static Logger logger = Logger.getLogger(DemoLogProp.class);

    public static void main(String[] args) {
        try {
            factorial(9);
            factorial(-3);
        } catch (IllegalArgumentException e) {

            // log ERROR level
            logger.error("negative argument: ", e);
        }
    }

    private static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("argument " + n + " is less than zero");
        }

        // log DEBUG level
        logger.debug("argument n is: " + n);
        int result = 1;
        for (int i = n; i >= 1; i--) {
            result *= i;
        }

        // log INFO level
        logger.info("result is: " + result);
        return result;
    }
}
