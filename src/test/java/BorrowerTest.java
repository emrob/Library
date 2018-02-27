import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;

    @Before
    public void before(){
        borrower = new Borrower();
        book = new Book("Brave new world", BookGenre.THRILLER);
    }

    @Test
    public void testRentBook(){
        borrower.rentBook(book);
        assertEquals(1, borrower.getBookCount());
    }

}
