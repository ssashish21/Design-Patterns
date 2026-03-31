package designPatterns.observer.observer;

public class SMSUser implements IObserver{
    @Override
    public void update(String message) {
        System.out.println("SMS User received message: " + message);
    }
}
