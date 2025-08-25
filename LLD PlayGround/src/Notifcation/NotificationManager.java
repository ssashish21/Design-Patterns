package Notifcation;

import Model.Event;
import Model.Subscriber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationManager {
    Map<String, List<Subscriber>> subscriberMap = new HashMap<>();

    public void subscribe(String eventName, Subscriber subscriber){
        subscriberMap.putIfAbsent(eventName, new ArrayList<>());
        subscriberMap.get(eventName).add(subscriber);
    }

    public void notify(Event event){
        List<Subscriber> subscribers = subscriberMap.get(event.getName());
        if(subscribers != null){
            for(Subscriber sub : subscribers){
                for(Chanel chanel : sub.getChanels()){
                    chanel.send(event, sub);
                }
            }
        }
    }
}
