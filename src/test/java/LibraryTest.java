import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library(100);
        book = new Book("Wind in the Willows");
    }

    @Test
    public void checkNumOfBooks() {
        assertEquals(0, library.getbooksSize());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.getbooksSize());
    }

    @Test
    public void cantAddIfStockisMoreThanCapacity(){
            library.addBook(book);
            assertEquals(1, library.getbooksSize());

    }



}

