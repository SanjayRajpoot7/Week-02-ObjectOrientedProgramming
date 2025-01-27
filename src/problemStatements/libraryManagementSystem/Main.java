package problemStatements.libraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        // Create different types of library items
        LibraryItem book = new Book("001", "The Great house wife", "ABC", "Nature");
        LibraryItem magazine = new Magazine("121", "National Geographic", "National Geographic Society", 123);
        LibraryItem dvd = new DVD("12", "Legend", "Experience about life", "Rajesh");

        // Demonstrate polymorphism by processing items with general LibraryItem reference
        LibraryItem[] libraryItems = {book, magazine, dvd};

        // Print details of each item
        for (LibraryItem item : libraryItems) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            System.out.println();

            // Reserve and check availability for reservable items
            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                reservableItem.reserveItem();
                System.out.println("The book is available: "+reservableItem.checkAvailability());
                System.out.println();
            }
        }
    }
}
