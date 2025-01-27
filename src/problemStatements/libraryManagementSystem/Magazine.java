package problemStatements.libraryManagementSystem;

public class Magazine extends LibraryItem implements Reservable {
    private int issueNumber;

    public Magazine(String itemId, String title, String author, int issueNumber) {
        super(itemId, title, author);
        this.issueNumber = issueNumber;
    }

    @Override
    public int getLoanDuration() {
        return 7; // Magazines can be loaned for 7 days
    }


    public void reserveItem() {
        System.out.println("Magazine '" + getTitle() + "' has been reserved.");
    }

    public boolean checkAvailability() {
        // Simplified logic, assuming all magazines are available
        System.out.println("Checking availability for magazine: " + getTitle());
        return true; // Always available in this example
    }
}
