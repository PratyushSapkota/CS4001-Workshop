package week8.workshop;


/**
 * Write a description of class ShoppingCart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingCart {
    private String itemName;
    private double itemPrice;
    private int quantity;

    public ShoppingCart(String itemName, double itemPrice, int quantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double calculateTotal() {
        return this.itemPrice * this.quantity;
    }

    public double calculateDiscountedTotal(double discountPercent) {
        double total = calculateTotal();
        return (1 - (discountPercent / 100)) * total;
    }

    public void displayCart() {
        System.out.println("Item name: " + this.itemName);
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Item Price: " + this.itemPrice);
    }


}