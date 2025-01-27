package problemStatements.onlineFoodDeliverySystem;

public class VegItem extends FoodItem {

        public VegItem(String itemName, double price, int quantity) {
            super(itemName, price, quantity);
        }

        @Override
        public double calculateTotalPrice() {
            // Veg items do not have additional charges
            return getPrice() * getQuantity();
        }

}
