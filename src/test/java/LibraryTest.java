import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Borrower borrower;


    @Before
    public void before(){
        library = new Library(100);
        book = new Book("Pretty Woman", BookGenre.ROMANCE);
        borrower = new Borrower();
        borrower.rentBook(book);


    }

    @Test
    public void checkNumOfBooks() {
        assertEquals(0, library.getStockSize());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.getStockSize());
    }

    @Test
    public void cantAddIfStockisMoreThanCapacity(){
            library.addBook(book);
            assertEquals(1, library.getStockSize());

    }

    @Test
    public void canLendBook(){
        library.bookLent(borrower, book);
        assertEquals(2, borrower.getBookCount());
        assertEquals(0, library.getStockSize());
    }



}

