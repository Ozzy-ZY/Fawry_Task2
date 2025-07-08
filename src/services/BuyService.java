package services;

import models.Book;
import services.BuyStrategy.BuyStrategyFactory;
import services.BuyStrategy.contracts.BuyStrategy;

public class BuyService {
    public double Buy(Book book, int quantity, String email, String address){
        BuyStrategy buyStrategy = null;
        try{
             buyStrategy = BuyStrategyFactory.getBuyStrategy(book.getBookType());
             return buyStrategy.ProcessBuy(book, quantity, email, address);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return 0; // just in case but it's not really going to happen
    }

}
