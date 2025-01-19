// Parent class: Book
class Book {
    // Public field
    public String ISBN;


    // Protected field
    protected String title;


    // Private field
    private String author;


    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }


    // Getter for author
    public String getAuthor() {
        return author;
    }


    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }


    // Method to display book information
    public void displayInfo() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }
}


// Subclass: EBook
class EBook extends Book {
    // Additional attribute for EBook
    private double fileSize; // In MB


    // Constructor
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author); // Call the constructor of the parent class
        this.fileSize = fileSize;
    }


    // Method to display eBook information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the parent class method
        System.out.println("File Size: " + fileSize + " MB");
    }


    public static void main(String[] args) {
        // Create a Book instance
        Book book = new Book("978-3-16-148410-0", "Java Programming", "John Doe");
        book.displayInfo();
        System.out.println();


        // Modify the author name using setter method
        book.setAuthor("Jane Smith");
        book.displayInfo();
        System.out.println();


        // Create an EBook instance
        EBook eBook = new EBook("978-1-23-456789-0", "Advanced Java", "Alice Brown", 5.5);
        eBook.displayInfo();
    }
}


