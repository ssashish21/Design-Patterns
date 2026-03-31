package designPatterns.observer.observer;

public class EmailUser implements IObserver{
    @Override
    public void update(String message) {
        System.out.println("Email User received message: " + message);
    }
}
