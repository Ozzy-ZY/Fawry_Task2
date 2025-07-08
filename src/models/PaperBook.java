package models;

public class PaperBook extends Book {
    public PaperBook(String ISBN, String title, int Year, double price, int stock) {
        super(ISBN, title, Year, price);
        this.stock = stock;
    }
    private int stock;

    public int getStock() {
        return stock;
    }
    public void addToStock(int quantity){
        stock += quantity;
    }
    public void removeFromStock(int quantity){
        stock -= quantity;
    }
}
