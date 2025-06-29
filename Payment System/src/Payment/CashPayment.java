package Payment;

public class CashPayment implements PaymentMethod{
    @Override
    public boolean Pay(double amount){
        System.out.println("Paid " + amount + " using Card!");
        return true;
    }
}
