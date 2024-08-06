package behaviour.mediator.implementation;

public interface Mediator {
    void notify(BComponent component, String action);
}
