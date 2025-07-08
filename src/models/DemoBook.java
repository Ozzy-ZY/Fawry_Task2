package models;

public class DemoBook extends Book {
    public DemoBook(String ISBN, String title, int Year, double price) {
        super(ISBN, title, Year, price);
    }

    @Override
    public BookType getBookType() {
        return BookType.DemoBook;
    }

    @Override
    public boolean Buyable() {
        return false;
    }

    @Override
    public int getStock() {
        return 0;
    }

    @Override
    public void ReduceQuantity(int quantity) {
        return;
    }

    @Override
    public String toString() {
        return super.toString() + " DemoBook";
    }
}
