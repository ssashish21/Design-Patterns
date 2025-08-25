package Notifcation;

import Model.Event;
import Model.Subscriber;

public class SMSChanel implements Chanel{
    @Override
    public void send(Event event, Subscriber sub) {
        System.out.println("SMS send to " + sub.getName() + " Event : " + event.getName());
    }
}
