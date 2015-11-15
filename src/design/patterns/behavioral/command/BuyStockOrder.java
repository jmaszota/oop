package design.patterns.behavioral.command;

/**
 * Created by jacek.maszota on 21.07.2015.
 */
//ConcreteCommand Class.
public class BuyStockOrder implements Order {

    private StockTrade stock;

    public BuyStockOrder ( StockTrade st) {
        stock = st;
    }

    @Override
    public void execute() {
            stock . buy( );
    }
}
