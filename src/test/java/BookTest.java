import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;


    @Before
    public void before(){
        book = new Book(Genre.ROMANCE);

    }

    @Test
    public void canGetGenre(){
        assertEquals(Genre.ROMANCE, book.getGenre());
    }

    @Test
    public void genreHasDescription(){
        assertEquals("love stories", book.getDescriptionFromEnum());
    }
}
