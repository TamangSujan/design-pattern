package behaviour.observer.implementation;

public class MediaSubscriber implements Subscriber{
    private final String name;
    public MediaSubscriber(String name){
        this.name = name;
    }
    @Override
    public void subscribe(Publisher publisher) {
        publisher.subscribe(this);
    }

    @Override
    public void unsubscribe(Publisher publisher) {
        publisher.unsubscribe(this);
    }

    @Override
    public void update(String content) {
        System.out.println("Received by: "+name+"\n"+content);
    }
}
