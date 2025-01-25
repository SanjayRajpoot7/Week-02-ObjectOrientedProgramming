package Single_Inheritance.libraryManagement;

public class Author extends Book {

    private String authorName;
    private String bio;

    // Constructor
    public Author(String title, int publicationYear, String authorName, String bio) {
        super(title, publicationYear); // Call the superclass constructor
        this.authorName = authorName;
        this.bio = bio;
    }

    // Overridden method to display book and author information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the superclass method
        System.out.println("Author Name: " + authorName);
        System.out.println("Author Bio: " + bio);
    }

}
