package Payment;

public class CardPayment implements PaymentMethod{
    @Override
    public boolean Pay(double amount){
        System.out.println("Paid " + amount + " using card!");
        return true;
    }
}
