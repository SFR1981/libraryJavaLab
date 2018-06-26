import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;


    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library();
        book = new Book();
        library.addBook(book);
    }

    @Test
    public void hasBorrowed(){
        assertEquals(0,borrower.hasBorrowed());

    }

    @Test
    public void canBorrowBook(){
        borrower.borrows(library);
        assertEquals(1, borrower.hasBorrowed());

    }
}
