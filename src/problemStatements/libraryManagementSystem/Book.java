package problemStatements.libraryManagementSystem;

public class Book extends LibraryItem implements Reservable {
        private String genre;

        public Book(String itemId, String title, String author, String genre) {
            super(itemId, title, author);
            this.genre = genre;
        }

        @Override
        public int getLoanDuration() {
            return 14; // Books can be loaned for 14 days
        }


        public void reserveItem() {
            System.out.println("Book '" + getTitle() + "' has been reserved.");
        }

        public boolean checkAvailability() {
            System.out.println("Checking availability for book: " + getTitle());
            return true;
        }


}
