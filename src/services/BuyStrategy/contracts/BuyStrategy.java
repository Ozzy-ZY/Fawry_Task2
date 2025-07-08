package services.BuyStrategy.contracts;

import models.Book;

public interface BuyStrategy {
    void ProcessBuy(Book book, int quantity, String email, String Address);
}
