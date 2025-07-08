package services.BuyStrategy.contracts;

import models.Book;

public interface BuyStrategy {
    double ProcessBuy(Book book, int quantity, String email, String Address);
}
