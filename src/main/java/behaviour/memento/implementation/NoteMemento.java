package behaviour.memento.implementation;

class NoteMemento implements Memento<Note>{
    private final Note note;
    public NoteMemento(Note note){
        this.note = note;
    }
    @Override
    public Note getState() {
        return note;
    }
}
