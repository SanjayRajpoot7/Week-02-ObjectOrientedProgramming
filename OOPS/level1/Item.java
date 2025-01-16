public class Item {

    public double displayItem(int itemCode, String itemName, int price, int quantity){
        double totalCost = quantity * price;
        System.out.println("Item code is: "+itemCode+"\nItem name is: "+itemName+"\nPrice of item: "+price);
        return totalCost;
    }
    public static void main(String[] args) {
      Item obj = new Item();
      double totalCost = obj.displayItem(85937723,"Infinix mobile",6999,25);
      System.out.println("Total cost of product is: "+totalCost);
    }
}
