package design_patterns._02_behavioral._06_observer._02_auction_example;

public interface Observer {
    void handleEvent(BidEvent event);
}
