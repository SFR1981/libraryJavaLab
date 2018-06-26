import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private int capacity;
    private ArrayList<Book> books;
    private HashMap<Genre, Integer> stock;

    public Library(){
        this.capacity = 100;
        this.books = new ArrayList<>();
        this.stock = new HashMap<>();
    }

    public int getBooks() {
        return books.size();
    }


    public void addBook(Book book) {

        this.books.add(book);
    }

    public void checkStock(Book book){
        if (books.size() < capacity){
            this.books.add(book);
        }

    }

    public Book removeBook() {
        return this.books.remove(0);
    }

    public int getStock(){
        return this.stock.size();
    }

    public void addStock(Genre genre, Integer quantity){
        stock.put(genre, quantity);

    }

    public int stockByGenre(Genre genre) {
        return stock.get(genre);
    }
}
