public enum Genre {
    HORROR("scary stories"),
    NONFICTION("real stories"),
    FANTASY("bad stories"),
    ROMANCE("love stories");

    private final String description;

    Genre(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }



}
