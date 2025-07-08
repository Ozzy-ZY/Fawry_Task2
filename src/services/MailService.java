package services;

import models.Book;
import models.EBook;
import services.contracts.IMailService;

public class MailService implements IMailService {
    @Override
    public void sendMail(Book eBook, String email) {
        System.out.println("Mail sent to " + email + "with Book"+ eBook);
    }
}
