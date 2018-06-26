import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

  Library library;
  Book book;


  @Before
    public void before(){
      library = new Library();
      book = new Book();
  }

  @Test
    public void getNumberOfBooks(){
      assertEquals(0, library.getBooks());

    }

    @Test
    public void canAddBooks(){
      library.addBook(book);
      assertEquals(1, library.getBooks());
    }

    @Test
    public void hasCapacity(){
      library.checkStock(book);
      assertEquals(1, library.getBooks());
    }


}
