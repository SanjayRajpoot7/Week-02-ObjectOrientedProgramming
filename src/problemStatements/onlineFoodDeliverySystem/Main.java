package problemStatements.onlineFoodDeliverySystem;

public class Main {
    public static void main(String[] args) {
        // Create instances of different food items
        FoodItem vegItem = new VegItem("Vegetable Biryani", 10.00, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 12.00, 3);

        // Process a list of food items (polymorphism in action)
        FoodItem[] foodItems = {vegItem, nonVegItem};

        double totalAmount = 0;
        for (FoodItem item : foodItems) {
            System.out.println(item.getItemDetails());
            System.out.println("Total Price (before discount): $" + item.calculateTotalPrice());

            // Apply discount if the item is discountable
            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                totalAmount += discountableItem.applyDiscount();
                System.out.println(discountableItem.getDiscountDetails());
                System.out.println("Total Price (after discount): $" + discountableItem.applyDiscount());
            } else {
                totalAmount += item.calculateTotalPrice();
            }
            System.out.println();
        }

        System.out.println("Total Amount for the Order: $" + totalAmount);
    }
}
