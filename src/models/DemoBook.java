package models;

public class DemoBook extends Book {
    public DemoBook(String ISBN, String title, int Year, double price) {
        super(ISBN, title, Year, price);
    }

    @Override
    public BookType getBookType() {
        return BookType.DemoBook;
    }

}
