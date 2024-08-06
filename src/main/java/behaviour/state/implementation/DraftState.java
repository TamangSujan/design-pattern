package behaviour.state.implementation;

public class DraftState implements State{
    private final User creator;
    public DraftState(User creator){
        this.creator = creator;
    }
    @Override
    public boolean isReadable(User user) {
        return user == creator;
    }

    @Override
    public boolean isWritable() {
        return true;
    }
}
