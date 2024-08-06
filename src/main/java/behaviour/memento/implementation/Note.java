package behaviour.memento.implementation;

class Note {
    private StringBuilder buffer;
    public Note(){
        buffer = new StringBuilder();
    }

    public void write(String text){
        buffer.append(text);
    }

    public void read(){
        System.out.println(buffer);
    }

    public Memento<Note> save(){
        Note copy = new Note();
        copy.buffer.append(buffer.toString());
        return new NoteMemento(copy);
    }

    public void restore(Memento<Note> userNote){
        buffer = userNote.getState().buffer;
    }
}
