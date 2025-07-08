package services.BuyStrategy;

import models.BookType;
import services.BuyStrategy.contracts.BuyStrategy;

import java.util.HashMap;

public class BuyServiceFactory {
    private static HashMap<BookType, BuyStrategy> strategies = new HashMap<>();
    static{
        strategies.put(BookType.PaperBook, new PaperBookBuyStrategy());
        strategies.put(BookType.EBook, new EBookBuyStrategy());
        strategies.put(BookType.DemoBook, new DemoBookBuyStrategy());
    }
    public static BuyStrategy getBuyStrategy(BookType bookType){
        var strategy = strategies.get(bookType);
        if(strategy == null){
            throw new IllegalStateException("no Buy Strategy found for " + bookType);
        }
        return strategy;
    }
}
