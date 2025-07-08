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
}
