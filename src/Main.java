import BookStores.TestClass;
import models.DemoBook;
import models.EBook;
import models.PaperBook;

import java.util.UUID;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("QUANTUM BOOK STORE DEMO");
        System.out.println("==========================\n");
        TestClass testClass = new TestClass(); // it uses the QuantumBookStore class to test it's functionality
        testClass.testBookAddition(); // should pass
        testClass.testPaperBookBuying(); // should pass
        testClass.testEBookBuying(); // should pass
        testClass.testBuyingDemoBook(); // should fail
        testClass.testBookRemoval(); // should pass
        testClass.testLowStockError(); // should fail
        testClass.testNonExistingBookError(); // should fail

    }
}