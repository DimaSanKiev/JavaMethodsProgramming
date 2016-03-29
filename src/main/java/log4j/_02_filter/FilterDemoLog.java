package log4j._02_filter;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import java.util.ArrayList;

public class FilterDemoLog {
    static {
        new DOMConfigurator().doConfigure("src/main/resources/log4j_filter.xml", LogManager.getLoggerRepository());
    }

    private static Logger logger = Logger.getLogger(FilterDemoLog.class);

    public static void main(String[] args) {
        ArrayList<Coin> list = new ArrayList<Coin>() {
            {
                this.add(new Coin(956, 1, "USD"));
                this.add(new Coin(3243, 1, "EUR"));
                this.add(new Coin(758, 1, "JPY"));
                this.add(new Coin(2151, 1, "UAH"));
            }
        };

        for (Coin coin : list) {
            logger.info(coin);
        }
    }
}
