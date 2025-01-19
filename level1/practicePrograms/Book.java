public class Book {
    String title;
    String author;
    int price;


    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }


    public Book(Book otherBook){
        this.title = otherBook.title;
        this.author = otherBook.author;
        this.price = otherBook.price;
    }


    public void displayValues(){
        System.out.println("Title: "+title+" \tAuthor: "+author+"\tPrice: "+price);
    }
    public static void main(String[] args) {
        Book book = new Book("BhagwadGeeta","Vyas",350);
        Book book2 = new Book(book);


        book.displayValues();
        book2.displayValues();


    }
}
