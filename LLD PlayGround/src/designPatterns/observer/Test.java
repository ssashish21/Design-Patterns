package designPatterns.observer;

import designPatterns.observer.observer.IObserver;
import designPatterns.observer.subject.PaymentService;
import designPatterns.observer.observer.Analytics;
import designPatterns.observer.observer.SMSUser;

public class Test {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        IObserver analytics = new Analytics();
        IObserver SMSUser = new SMSUser();

        paymentService.registerObserver(analytics);
        paymentService.registerObserver(SMSUser);

        paymentService.notifyObservers("problems.PizzaBillingSystem.Payment of $100 received");
    }
}
