package log4j._02_filter;

import org.apache.log4j.or.ObjectRenderer;

public class CoinRenderer implements ObjectRenderer {
    @Override
    public String doRender(Object obj) {
        StringBuilder builder = new StringBuilder(32);
        if (obj instanceof Coin) {
            Coin coin = (Coin) obj;
            String currency = coin.getCurrencyName();
            int id = coin.getId();
            int value = coin.getValue();
            builder.append(id + ": " + value + "(" + currency + ")");
        }
        return builder.toString();
    }
}
