package design.patterns.behavioral.command;

/**
 * Created by jacek.maszota on 21.07.2015.
 */
// Receiver class.
class StockTrade {
    public void buy() {
        System.out.println("You want to buy stocks");
    }
    public void sell() {
        System.out.println("You want to sell stocks ");
    }
}
