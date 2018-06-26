import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> books;

    public Library(){
        this.capacity = 100;
        this.books = new ArrayList<>();
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

}
