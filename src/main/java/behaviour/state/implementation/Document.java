package behaviour.state.implementation;

public interface Document {
    void readBy(User user);
    void write(String text);
    void updateState(State state);
}
