import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<>();
    }

    public void rentBook(Book book) { this.collection.add(book);}

    public int getBookCount() {return this.collection.size();}



}
