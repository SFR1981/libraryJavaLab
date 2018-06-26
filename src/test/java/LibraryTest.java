import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class LibraryTest {

  Library library;
  Book book;


  @Before
    public void before(){
      library = new Library();
      book = new Book(Genre.ROMANCE);
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

    @Test
    public void hasLoaned(){
      library.addBook(book);
      library.removeBook();
      assertEquals(0, library.getBooks());
    }

    @Test
    public void hashStock(){
      assertEquals(0, library.getStock());

    }

    @Test
    public void addStock(){
      library.addStock(Genre.ROMANCE, 32);
      assertEquals(1, library.getStock());
    }

    @Test
    public void stockByGenre(){
      library.addStock(Genre.FANTASY, 81);
      assertEquals(81, library.stockByGenre(Genre.FANTASY));
    }


}
