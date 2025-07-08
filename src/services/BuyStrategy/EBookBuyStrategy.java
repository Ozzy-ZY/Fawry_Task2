package services.BuyStrategy;

import models.Book;
import services.BuyStrategy.contracts.BuyStrategy;
import services.MailService;

public class EBookBuyStrategy implements BuyStrategy {
    @Override
    public double ProcessBuy(Book book, int quantity, String email, String Address) {
        System.out.println("Processing EBook" + book +"...");
        MailService mailService = new MailService();
        mailService.sendMail(book, email);
        return book.getPrice(); // the quantity doesn't matter for EBooks;
    }
}
