package services;

import models.Book;
import models.PaperBook;
import services.contracts.IShippingService;

public class ShippingService implements IShippingService {
    @Override
    public void ship(Book paperBook, String address) {
        System.out.println(paperBook +" Shipped to " + address);
    }
}
