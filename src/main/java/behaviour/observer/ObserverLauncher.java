package behaviour.observer;

import behaviour.observer.implementation.MediaPublisher;
import behaviour.observer.implementation.MediaSubscriber;
import behaviour.observer.implementation.Publisher;
import behaviour.observer.implementation.Subscriber;

public class ObserverLauncher {
    public static void main(String[] args) {
        Publisher nepalTelevision = new MediaPublisher("Nepal Television");
        Publisher news24 = new MediaPublisher("News 24");

        Subscriber ram = new MediaSubscriber("Ram");
        Subscriber sita = new MediaSubscriber("Sita");
        Subscriber hari = new MediaSubscriber("Hari");

        ram.subscribe(nepalTelevision);
        hari.subscribe(nepalTelevision);
        sita.subscribe(news24);

        nepalTelevision.publish("Breaking News: Nepal has not found culprit behind Nirmala Panta murder!");
        news24.publish("Breaking News: Ravi Lamichhane has resigned from Home Minister!");

        hari.unsubscribe(nepalTelevision);
        nepalTelevision.publish("Breaking News: Comparing to last year, the number of youths leaving Nepal has been increased!\nNepal Government has requested not to leave the country to youths.");
    }
}
