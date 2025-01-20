public class Book {

    static String libraryName;
    final int ISBN;

    String title;
    String author;

    Book(String title, String author, int ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public void display(){
        if (this instanceof Book) {
            System.out.println("bankAccount is an instance of book class");
        } else {
            System.out.println("bankAccount is not instance of book class");
        }
        System.out.println("Title name is: "+title+" \nAuthor name: "+author+" \nISBN number: "+ISBN);
    }


    public static void main(String[] args) {
        Book book = new Book("Ramayan", "Valmiki",247546);
        Book book2 = new Book("Mahabharat", "Vyas",93656732);


        book.display();
        System.out.println();
        book2.display();
    }
}
