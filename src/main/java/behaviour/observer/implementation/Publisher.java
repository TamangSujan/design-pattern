package behaviour.observer.implementation;

public interface Publisher {
    void publish(String content);
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
}
