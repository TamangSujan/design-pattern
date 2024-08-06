package behaviour.state.implementation;

public class BlogDocument implements Document{
    private final User creator;
    private State state;
    private final StringBuilder buffer;
    public BlogDocument(User creator){
        this.creator = creator;
        state = new DraftState(creator);
        this.buffer = new StringBuilder();
    }
    @Override
    public void readBy(User user) {
        if(state.isReadable(user)){
            System.out.println(buffer);
        }
    }

    @Override
    public void write(String text) {
        if(state.isWritable()){
            buffer.append(text);
        }
    }

    @Override
    public void updateState(State state) {
        this.state = state;
    }
}
