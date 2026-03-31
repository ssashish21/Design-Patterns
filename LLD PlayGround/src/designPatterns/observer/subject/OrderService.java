package designPatterns.observer.subject;

import designPatterns.observer.observer.IObserver;

import java.util.List;

public class OrderService implements ISubject{

     private List<IObserver> observers;

     public void createOrder(String orderDetails) {
        System.out.println("OrderService: Creating order with details: " + orderDetails);
        // Simulate order creation logic here
        notifyObservers("New order created: " + orderDetails);
    }

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
        System.out.println("OrderService: Observer removed.");
    }

    @Override
    public void notifyObservers(String message) {
        for (IObserver observer : observers) {
            observer.update(message);
        }
    }
}
