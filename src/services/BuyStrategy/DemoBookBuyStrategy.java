package services.BuyStrategy;

import models.Book;
import services.BuyStrategy.contracts.BuyStrategy;

public class DemoBookBuyStrategy implements BuyStrategy {
    @Override
    public void ProcessBuy(Book book, int quantity, String email, String Address) {
        throw new UnsupportedOperationException("Demo Books are not buyable");
    }
}
