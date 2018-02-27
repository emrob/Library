import java.awt.print.Book;
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;


    public Library(int capacity) {
        this.stock = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getbooksSize() {
        return this.stock.size();
    }


    public void addBook(Book book) {
        if (getbooksSize() < this.capacity) {

            this.stock.add(book);
        }


    }

}
