package designPatterns.observer.subject;

import designPatterns.observer.observer.IObserver;

import java.util.List;

public class PaymentService implements ISubject{
    List<IObserver> observers = new java.util.ArrayList<>();

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for(IObserver observer : observers) {
            observer.update(message);
        }
    }
}
