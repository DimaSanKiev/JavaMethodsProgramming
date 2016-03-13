package design_patterns._02_behavioral._07_observer._02_auction_example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AuctionObserver implements Observer {
    private List<Bid> list = new ArrayList();

    public void addObservable(Bid bid) {
        list.add(bid);
    }

    public void removeObservable(Bid bid) {
        // deleting object from observable list
    }

    public void handleEvent(BidEvent event) {
        double newPrice = event.getSource().getPrice();
        double price;
        Iterator<Bid> iterator = list.iterator();
        boolean lead = true;
        while (iterator.hasNext()) {
            Bid bid = iterator.next();
            price = bid.getPrice();
            if (newPrice > price) {
                bid.setLeader(false);
            } else if (newPrice < price) {
                lead = false;
            }
        }
        if (lead) {
            event.getSource().setLeader(true);
            LeaderInfo.currentPrice = newPrice;
            System.out.println("Leading Price " + newPrice);
        }
    }
}
