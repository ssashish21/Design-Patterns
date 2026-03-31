package designPatterns.observer.observer;

public class Analytics implements IObserver{
    @Override
    public void update(String message) {
        System.out.println("Analytics received message: " + message);
    }
}
