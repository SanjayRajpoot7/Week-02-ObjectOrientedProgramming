import java.util.ArrayList;

public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize CartItem
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to get the total cost of the current cart item
    public double getTotalCost() {
        return price * quantity;
    }

    // Method to display the item details
    public void displayItemDetails() {
        System.out.println("Item: " + itemName + ", Price: $" + price + ", Quantity: " + quantity + ", Total: $" + getTotalCost());
    }

    // Getter for item name
    public String getItemName() {
        return itemName;
    }

    // Setter for quantity (to update after removing an item or changing quantity)
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // ShoppingCart class inside the same CartItem class
    static class ShoppingCart {
        private ArrayList<CartItem> cartItems;

        // Constructor to initialize the shopping cart
        public ShoppingCart() {
            cartItems = new ArrayList<>();
        }

        // Method to add an item to the cart
        public void addItemToCart(String itemName, double price, int quantity) {
            // Check if item is already in cart, if so, update the quantity
            for (CartItem item : cartItems) {
                if (item.getItemName().equalsIgnoreCase(itemName)) {
                    item.setQuantity(item.getQuantity() + quantity);
                    System.out.println("Item " + itemName + " quantity updated to " + item.getQuantity() + ".");
                    return;
                }
            }
            // If the item isn't already in the cart, add it as a new CartItem
            cartItems.add(new CartItem(itemName, price, quantity));
            System.out.println("Item " + itemName + " added to the cart.");
        }

        // Method to remove an item from the cart
        public void removeItemFromCart(String itemName) {
            for (CartItem item : cartItems) {
                if (item.getItemName().equalsIgnoreCase(itemName)) {
                    cartItems.remove(item);
                    System.out.println("Item " + itemName + " removed from the cart.");
                    return;
                }
            }
            System.out.println("Item " + itemName + " not found in the cart.");
        }

        // Method to display the total cost of items in the cart
        public double getTotalCost() {
            double total = 0;
            for (CartItem item : cartItems) {
                total += item.getTotalCost();
            }
            return total;
        }

        // Method to display the details of all items in the cart
        public void displayCartDetails() {
            if (cartItems.isEmpty()) {
                System.out.println("Your cart is empty.");
            } else {
                System.out.println("Cart Details:");
                for (CartItem item : cartItems) {
                    item.displayItemDetails();
                }
            }
        }
    }

    private int getQuantity() {
        return 0;
    }

    public static void main(String[] args) {
        // Create a ShoppingCart object
        ShoppingCart cart = new ShoppingCart();

        // Adding items to the cart (without user input)
        cart.addItemToCart("Apple", 1.5, 3);  // Item with name "Apple", price $1.5, quantity 3
        cart.addItemToCart("Banana", 1.2, 2); // Item with name "Banana", price $1.2, quantity 2
        cart.addItemToCart("Orange", 2.0, 5); // Item with name "Orange", price $2.0, quantity 5

        // Display cart details
        cart.displayCartDetails();

        // Remove an item (e.g., "Banana")
        cart.removeItemFromCart("Banana");

        // Display cart details after removal
        cart.displayCartDetails();

        // Display the total cost of items in the cart
        double totalCost = cart.getTotalCost();
        System.out.println("Total cost of items in the cart: $" + totalCost);
    }
}
