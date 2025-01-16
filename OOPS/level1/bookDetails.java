public class bookDetails {

    public void displayBookDetails(String title, String author, int price){
        System.out.println("Name of title: "+title+"\nName of author: "+author+"\nPrice of book: "+price);
    }
    public static void main(String[] args) {
        bookDetails bd = new bookDetails();
        bd.displayBookDetails("Bhagwad Geeta", "Vyas", 350);
    }
}
