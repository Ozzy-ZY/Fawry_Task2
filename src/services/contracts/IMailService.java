package services.contracts;

import models.Book;

public interface IMailService {
    void sendMail(Book eBook, String email);
}
