package behaviour.state.implementation;

public class PublishedState implements State{
    @Override
    public boolean isReadable(User user) {
        return true;
    }

    @Override
    public boolean isWritable() {
        return false;
    }
}
