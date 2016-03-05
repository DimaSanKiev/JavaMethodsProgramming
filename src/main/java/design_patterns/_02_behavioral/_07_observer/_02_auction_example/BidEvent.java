package design_patterns._02_behavioral._07_observer._02_auction_example;

import java.util.EventObject;

public class BidEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public BidEvent(Object source) {
        super(source);
    }

    @Override
    public Bid getSource() {
        return (Bid) super.getSource();
    }
}
