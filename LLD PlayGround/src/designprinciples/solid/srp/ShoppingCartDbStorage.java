package designprinciples.solid.srp;

public class ShoppingCartDbStorage {
    ShoppingCart cart;

    public ShoppingCartDbStorage(ShoppingCart cart) {
        this.cart = cart;
    }

    public void saveToDatabase(ShoppingCart cart) {
        // Code to save the shopping cart to a database
        System.out.println("Saving shopping cart to database...");
    }
}
