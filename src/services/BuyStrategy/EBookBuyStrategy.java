package services.BuyStrategy;

import models.Book;
import services.BuyStrategy.contracts.BuyStrategy;
import services.MailService;

public class EBookBuyStrategy implements BuyStrategy {
    @Override
    public void ProcessBuy(Book book, int quantity, String email, String Address) {
        System.out.println("Processing EBook" + book +" Buy for " + quantity + " books");
        MailService mailService = new MailService();
        mailService.sendMail(book, email);
    }
}
