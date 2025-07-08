package services.BuyStrategy;

import models.Book;
import services.BuyStrategy.contracts.BuyStrategy;
import services.ShippingService;

public class PaperBookBuyStrategy implements BuyStrategy {
    @Override
    public double ProcessBuy(Book book, int quantity, String email, String Address) {
        System.out.println("Processing PaperBook" + book +" Buy for " + quantity + " books");
        var shippingService = new ShippingService();
        shippingService.ship(book, email);
        return book.getPrice() * quantity;
    }
}
