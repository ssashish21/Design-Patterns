package designprinciples.solid.srp;

public class ShoppingCartPrinter {
    ShoppingCart cart;

    public ShoppingCartPrinter(ShoppingCart cart) {
        this.cart = cart;
    }

    public void printInvoice(ShoppingCart cart) {
        System.out.println("Invoice:");
        for (Product product : cart.getProducts()) {
            System.out.println(product.getName() + ": $" + product.getPrice());
        }
        System.out.println("Total: $" + cart.calculateTotal());
    }
}
