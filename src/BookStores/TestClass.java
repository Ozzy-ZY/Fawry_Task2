package BookStores;

import models.DemoBook;
import models.EBook;
import models.PaperBook;

public class TestClass {
    QuantumBookStore bookStore = new QuantumBookStore();
    public void testBookAddition(){
        System.out.println("==Test: Add a book to the store");
        bookStore.addBook(new EBook("Ebook1","Title1",2020,100,"pdf"));
        bookStore.addBook(new EBook("Ebook2","Title2",2010,50,"pdf"));
        bookStore.addBook(new PaperBook("Paperbook1","Title3",2015,200,6));
        bookStore.addBook(new PaperBook("Paperbook2","Title4",2016,100,10));
        bookStore.addBook(new DemoBook("Demobook1","Title5",2017,100));
        System.out.println("==Inventory: ");
        bookStore.viewInventory();
        System.out.println("------------------------------------");
    }
    public void testBookRemoval(){
        System.out.println("==Test: Remove a book from the store");
        bookStore.removeOutdatedBooks(10);
        System.out.println("==Inventory: ");
        bookStore.viewInventory();
        System.out.println("------------------------------------");

    }
    public void testEBookBuying(){
        System.out.println("==Test: Buy an Ebook");
        try{
            double paidAmount = bookStore.buyBook("Ebook1",1,"zyad@gmail.com","GIza");
            System.out.println("Paid amount is " + paidAmount);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("------------------------------------");
    }
    public void testPaperBookBuying(){
        System.out.println("==Test: Buy a Paperbook");
        try{
            double paidAmount = bookStore.buyBook("Paperbook1",1,"Mahmoud@gmail.com","Cairo");
            System.out.println("Paid amount is " + paidAmount);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("------------------------------------");
    }
    public void testLowStockError(){
        System.out.println("==Test: Buy a Paperbook with low stock");
        bookStore.addBook(new PaperBook("lowStockBook","Title6",2018,100,1));
        try{
            bookStore.buyBook("lowStockBook",5,"Zyad@gmail.com","earth");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("------------------------------------");
    }
    public void testNonExistingBookError(){
        System.out.println("==Test: Buy a non existing book");
        try{
            bookStore.buyBook("nonExistingBook",1,"Zyad@gmail.com","Giza");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("------------------------------------");
    }
    public void testBuyingDemoBook(){
        System.out.println("==Test: Buy a demoBook"); // not possible
        bookStore.addBook(new DemoBook("DemoBook1","Title7",2019,100));
        try{
            bookStore.buyBook("DemoBook1",3,"Zyad@gmail.com","Cairo");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("------------------------------------");
    }
}
