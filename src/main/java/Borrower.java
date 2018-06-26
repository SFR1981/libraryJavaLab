import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> borrowed;

    public Borrower(){
        this.borrowed = new ArrayList<>();



    }

    public int hasBorrowed(){
        return this.borrowed.size();
    }

    public void borrows(Library library){
        Book book = library.removeBook();
        this.borrowed.add(book);
    }
}