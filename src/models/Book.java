package models;

import java.time.LocalDate;

public abstract class Book {
    private String ISBN;
    private String title;
    private int year;
    private double price;
    public Book(String ISBN, String title, int Year, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.year = Year;
        this.price = price;
    }
    public abstract BookType getBookType();
    public abstract boolean Buyable();
    public abstract int getStock();
    public abstract void ReduceQuantity(int quantity);
    public boolean isOutdated(int yearCount){
        return LocalDate.now().getYear() - year > yearCount;
    }
    public String getISBN() {
        return ISBN;
    }// didn't put a setter as it's not possible to change the ISBN after it's been added

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    } // didn't put the setter of the year aswell just like ISBN

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
