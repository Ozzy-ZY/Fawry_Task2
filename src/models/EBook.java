package models;

public class EBook extends Book {
    public EBook(String ISBN, String title, int Year, double price, String fileType) {
        super(ISBN, title, Year, price);
        this.fileType = fileType;
    }
    private String fileType;

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public BookType getBookType() {
        return BookType.EBook;
    }

    @Override
    public boolean Buyable() {
        return true;
    }

    @Override
    public int getStock() {
        return -1;
    }

    @Override
    public void ReduceQuantity(int quantity) {
        return;
    }

    @Override
    public String toString() {
        return super.toString()+ " Format: "+ fileType;
    }
}
