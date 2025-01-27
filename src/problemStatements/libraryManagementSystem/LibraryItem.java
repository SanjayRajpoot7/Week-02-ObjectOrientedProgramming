package problemStatements.libraryManagementSystem;

public abstract class LibraryItem {
        private String itemId;
        private String title;
        private String author;

        // Constructor to initialize library item details
        public LibraryItem(String itemId, String title, String author) {
            this.itemId = itemId;
            this.title = title;
            this.author = author;
        }

        // Abstract method to get loan duration (to be implemented by subclasses)
        public abstract int getLoanDuration(); // Loan duration in days

        // Concrete method to return item details
        public String getItemDetails() {
            return "Item ID: " + itemId + "\nTitle: " + title + "\nAuthor: " + author;
        }

        // Getter methods
        public String getItemId() {
            return itemId;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }
    }

