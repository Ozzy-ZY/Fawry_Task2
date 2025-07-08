package models;

public class PaperBook extends Book {
    public PaperBook(String ISBN, String title, int Year, double price, int stock) {
        super(ISBN, title, Year, price);
        this.stock = stock;
    }
    private int stock;
    public void addToStock(int quantity){
        stock += quantity;
    }
    public void removeFromStock(int quantity){
        stock -= quantity;
    }
    @Override
    public int getStock() {
        return stock;
    }

    @Override
    public void ReduceQuantity(int quantity) {
        stock -= quantity;
    }

    @Override
    public BookType getBookType() {
        return BookType.PaperBook;
    }

    @Override
    public boolean Buyable() {
        return stock > 0;
    }

    @Override
    public String toString() {
        return super.toString()+ " Stock: "+ stock;
    }
}
