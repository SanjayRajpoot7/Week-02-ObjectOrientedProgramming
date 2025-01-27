package problemStatements.onlineFoodDeliverySystem;

public class NonVegItem extends FoodItem {

        private static final double nonVegAdditionalCharge = 2.50; // Additional charge for non-veg items

        public NonVegItem(String itemName, double price, int quantity) {
            super(itemName, price, quantity);
        }

        @Override
        public double calculateTotalPrice() {
            // Non-veg items have an additional charge
            return (getPrice() + nonVegAdditionalCharge) * getQuantity();
        }

}
