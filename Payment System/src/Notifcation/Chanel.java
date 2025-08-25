package Notifcation;

import Model.Event;
import Model.Subscriber;

public interface Chanel {
    void send(Event event, Subscriber sub);
}
