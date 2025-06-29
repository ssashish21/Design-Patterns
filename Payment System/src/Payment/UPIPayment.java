package Payment;

public class UPIPayment implements PaymentMethod{
    @Override
    public boolean Pay(double amount){
        System.out.println("Paid " + amount + " using phonePay!");
        return true;
    }
}
