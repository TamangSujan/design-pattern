package behaviour.state.implementation;

public interface State {
    boolean isReadable(User user);
    boolean isWritable();
}
