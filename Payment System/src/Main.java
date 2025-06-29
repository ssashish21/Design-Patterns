import Payment.CardPayment;
import Payment.Payment;
import Payment.PaymentMethod;

public class Main {
    public static void main(String[] args) {
        PaymentMethod paymentMethod = new CardPayment();
        Payment payment = new Payment(100, paymentMethod);
        payment.processPayment();

    }
}