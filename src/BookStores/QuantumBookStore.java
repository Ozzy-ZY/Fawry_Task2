package BookStores;

import models.Book;
import services.BuyService;

import java.util.ArrayList;
import java.util.HashMap;

class QuantumBookStore {
    private HashMap<String, Book> inventory; // isbn -> book
    private BuyService buyService;
    public QuantumBookStore() {
        this.inventory = new HashMap<>();
        this.buyService = new BuyService();
    }
    public void addBook(Book book){
        inventory.put(book.getISBN(), book);
        System.out.println(book + " has been added to inventory");
    }
    public void viewInventory(){
        for(var book : inventory.values()){
            System.out.println(book);
        }
    }
    public ArrayList<Book> removeOutdatedBooks(int yearCount){
        ArrayList<Book> outdatedBooks = new ArrayList<>();
        inventory.entrySet().removeIf(pair -> {
           var book = pair.getValue();
           if(book.isOutdated(yearCount)){
               outdatedBooks.add(book);
               return true;
           }
           return false;
        });
        System.out.println(outdatedBooks.size() + " books have been removed from inventory");
        return outdatedBooks;
    }
    public double buyBook(String isbn, int quantity, String email, String address) throws IllegalArgumentException{
        var book = inventory.get(isbn);
        if(book == null){
            throw new IllegalArgumentException(isbn + " does not exist");
        }
        if(!book.Buyable()){
            throw new IllegalArgumentException(isbn + " is not available");
        }
        if(quantity > book.getStock() && book.getStock() != -1){
            throw new IllegalArgumentException(isbn + " does not have enough stock");
        }
        double paidAmount = 0;
        try{
            paidAmount = buyService.Buy(book,quantity,email,address);
            System.out.println("Paid amount for " + book + " is " + paidAmount);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        book.ReduceQuantity(quantity);
        return paidAmount;
    }
}
