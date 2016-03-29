package log4j._02_filter;

public class Coin {
    private int id;
    private int value;
    private String currencyName;

    public Coin() {
    }

    public Coin(int id, int value, String currencyName) {
        this.id = id;
        this.value = value;
        this.currencyName = currencyName;
    }

    public int getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    public String getCurrencyName() {
        return currencyName;
    }
}
