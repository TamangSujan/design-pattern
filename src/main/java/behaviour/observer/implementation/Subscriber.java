package behaviour.observer.implementation;

public interface Subscriber {
    void subscribe(Publisher publisher);
    void unsubscribe(Publisher publisher);
    void update(String content);
}
