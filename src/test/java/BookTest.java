import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("1984", BookGenre.THRILLER);
    }

    @Test
    public void canGetGenre(){
        assertEquals(BookGenre.THRILLER,book.getGenre());
    }
}
