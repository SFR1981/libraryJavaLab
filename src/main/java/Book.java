public class Book {

    private Genre genre;

    public Book(Genre genre){
        this.genre = genre;
    }

    public Genre getGenre(){
        return this.genre;
    }

    public String getDescriptionFromEnum(){
        return this.genre.getDescription();
    }

}
