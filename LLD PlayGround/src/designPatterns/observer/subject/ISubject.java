package designPatterns.observer.subject;

import designPatterns.observer.observer.IObserver;

public interface ISubject {
        void registerObserver(IObserver observer);
        void removeObserver(IObserver observer);
        void notifyObservers(String message);
}
