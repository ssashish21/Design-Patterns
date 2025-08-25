import Model.Event;
import Model.Subscriber;
import Notifcation.EmailChanel;
import Notifcation.NotificationManager;
import Notifcation.SMSChanel;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        NotificationManager nm = new NotificationManager();


        Subscriber ashish = new Subscriber(10, "Ashish", List.of(new EmailChanel()));
        Subscriber julie = new Subscriber(11, "Julie", List.of(new EmailChanel(), new SMSChanel()));

        nm.subscribe("USER_REGISTERED", ashish);
        nm.subscribe("USER_REGISTERED", julie);

        Event event = new Event(1, "USER_REGISTERED", "User has been successfully registered");
        nm.notify(event);

    }
}