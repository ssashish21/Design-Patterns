package Payment;

public class Payment {
    private double amount;
    private PaymentMethod paymentMethod;

    public Payment(double amount, PaymentMethod paymentMethod){
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(){
        boolean status = paymentMethod.Pay(amount);
        System.out.println("Payment status : " + status);
    }
}
