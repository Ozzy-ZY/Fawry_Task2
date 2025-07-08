package services.contracts;

import models.Book;

public interface IShippingService {
    void ship(Book paperBook, String address);
}
