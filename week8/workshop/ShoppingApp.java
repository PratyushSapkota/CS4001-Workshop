package week8.workshop;


/**
 * Write a description of class ShoppingApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingApp {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart("item1", 4.5, 10);

        shoppingCart.displayCart();

        System.out.println("Updating quantity");
        shoppingCart.setQuantity(20);

        System.out.println("New quantity: ");
        System.out.println(shoppingCart.getQuantity());

        System.out.println("Total: ");
        System.out.println(shoppingCart.calculateTotal());

        System.out.println("30% discounted total: ");
        System.out.println(shoppingCart.calculateDiscountedTotal(30));


    }
}