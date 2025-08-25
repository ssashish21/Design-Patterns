package Notifcation;

import Model.Event;
import Model.Subscriber;

public class EmailChanel implements Chanel{
    @Override
    public void send(Event event, Subscriber sub) {
        System.out.println("Email send to " + sub.getName() + " Event : " + event.getName());
    }
}
