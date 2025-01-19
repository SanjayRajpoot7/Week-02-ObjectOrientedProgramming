public class BookLibrary {


    String title;
    String author;
    int price;
    int bookAvailability;


    public BookLibrary(String title, String author, int price, int bookAvailability){
        this.title = title;
        this.author = author;
        this.price = price;
        this.bookAvailability =bookAvailability;
    }
    boolean isAvailable = false;
    public boolean checkAvailability(){
        if(bookAvailability > 0){
            isAvailable = true;
        }
        return isAvailable;
    }


    public void borrowBook(){
        System.out.println("Check book is available or not: "+isAvailable);
        System.out.println("Title: "+title);
        System.out.println("Author name: "+author);
        System.out.println("Price: "+price);
        System.out.println("Available: "+bookAvailability);
    }


    public static void main(String[] args) {
        BookLibrary bookLibrary = new BookLibrary("Ramayan","Tulsidas",350,3);


        bookLibrary.checkAvailability();
        bookLibrary.borrowBook();
    }
}


