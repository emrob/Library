public class Book extends java.awt.print.Book {
    private String name;
    private BookGenre genre;


    public Book(String name, BookGenre genre){
        this.name = name;
        this.genre = genre;

    }

    public BookGenre getGenre(){
        return this.genre;
    }
}
