package behaviour.observer.implementation;

import java.util.LinkedList;
import java.util.List;

public class MediaPublisher implements Publisher{
    private final List<Subscriber> subscribers;
    private final String name;
    public MediaPublisher(String name){
        this.name = name;
        subscribers = new LinkedList<>();
    }
    @Override
    public void publish(String content) {
        for(Subscriber subscriber: subscribers){
            subscriber.update("Sent from: "+name+"\nContent: "+content);
        }
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }
}
