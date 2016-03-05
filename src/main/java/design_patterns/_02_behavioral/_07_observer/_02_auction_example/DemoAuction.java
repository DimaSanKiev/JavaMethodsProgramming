package design_patterns._02_behavioral._07_observer._02_auction_example;

import java.util.ArrayList;
import java.util.List;

public class DemoAuction {
    public static void main(String[] args) {
        Bid bid1 = new Bid(1, 34);
        Bid bid2 = new Bid(2, 35);
        Bid bid3 = new Bid(3, 14);
        Bid bid4 = new Bid(4, 20);
        Bid bid5 = new Bid(5, 39);

        AuctionObserver observer = new AuctionObserver();
        bid1.addObserver(observer);
        bid2.addObserver(observer);
        bid3.addObserver(observer);
        bid4.addObserver(observer);
        bid5.addObserver(observer);

        List<Bid> list = new ArrayList<>();
        list.add(bid1);
        list.add(bid2);
        list.add(bid3);
        list.add(bid4);
        list.add(bid5);

        System.out.println("First:");
        bid3.changePrice(40);       // bigger offer than max
        list.forEach(System.out::println);

        System.out.println("Second:");
        bid2.changePrice(40);       // less offer than max
        list.forEach(System.out::println);

        System.out.println("Third:");
        bid3.changePrice(50);       // bigger offer than max
        list.forEach(System.out::println);
    }
}
