package design.patterns.behavioral.command;

/**
 * Created by jacek.maszota on 21.07.2015.
 */
//ConcreteCommand Class.
public class SellStockOrder implements Order {

    private StockTrade stock;

    public SellStockOrder(StockTrade st) {
        stock = st;
    }

    @Override
    public void execute() {
            stock . sell( );
    }
}
