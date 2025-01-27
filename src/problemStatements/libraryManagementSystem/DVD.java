package problemStatements.libraryManagementSystem;

public class DVD extends LibraryItem {
    private String director;

    public DVD(String itemId, String title, String author, String director) {
        super(itemId, title, author);
        this.director = director;
    }

    @Override
    public int getLoanDuration() {
        return 5; // DVDs can be loaned for 5 days
    }
}
