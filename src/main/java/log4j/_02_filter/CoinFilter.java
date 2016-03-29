package log4j._02_filter;

import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggingEvent;

public class CoinFilter extends Filter {
    @Override
    public int decide(LoggingEvent event) {
        int result = Filter.NEUTRAL;
        Object object = event.getMessage();
        if (object instanceof Coin) {
            Coin coin = (Coin) object;
            int id = coin.getId();
            // if id < 1000 - ignore, otherwise - log
            result = id < 1000 ? Filter.DENY : Filter.ACCEPT;
        }
        return result;
    }
}
