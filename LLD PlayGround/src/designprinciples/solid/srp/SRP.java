package designprinciples.solid.srp;

public class SRP{
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 999.99);
        Product phone = new Product("Phone", 499.99);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(laptop);
        cart.addProduct(phone);

        ShoppingCartDbStorage dbStorage = new ShoppingCartDbStorage(cart);
        dbStorage.saveToDatabase(cart);
        ShoppingCartPrinter printer = new ShoppingCartPrinter(cart);
        printer.printInvoice(cart);


    }
}
