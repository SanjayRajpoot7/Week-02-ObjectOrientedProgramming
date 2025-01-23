import java.util.ArrayList;

class Library {
    private String libraryName;
    private ArrayList<Book> books;

    // Constructor to initialize the library name
    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library's collection
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display the books in the library
    public void displayBooks() {
        System.out.println("Library: " + libraryName);
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}

class Book {
    private String title;
    private String author;

    // Constructor to initialize book details
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter methods for title and author
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public static void main(String[] args) {
        // Create some Book objects
        Book book1 = new Book("Aptitude", "Agarwal");
        Book book2 = new Book("Reasoning", "Jay");
        Book book3 = new Book("Math", "Raj");

        // Create two Library objects
        Library library1 = new Library("Atul Library");
        Library library2 = new Library("Central Library");

        // Add books to libraries
        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book3);

        // Display books in each library
        library1.displayBooks();
        System.out.println();
        library2.displayBooks();
    }
}
