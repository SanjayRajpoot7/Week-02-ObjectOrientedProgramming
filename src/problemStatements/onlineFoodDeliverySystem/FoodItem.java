package problemStatements.onlineFoodDeliverySystem;

// Abstract class FoodItem
public abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize food item details
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Abstract method to calculate total price (to be implemented by subclasses)
    public abstract double calculateTotalPrice();

    // Concrete method to return item details
    public String getItemDetails() {
        return "Item Name: " + itemName + "\nPrice: $" + price + "\nQuantity: " + quantity;
    }

    // Getter methods
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

