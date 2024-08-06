package behaviour.memento.implementation;

import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class NoteApplication {
    private final Queue<Memento<Note>> userNoteHistory;
    private final Memento<Note> initialSnapshot;
    private final Note note;
    public NoteApplication(){
        userNoteHistory = new LinkedBlockingQueue<>();
        this.note = new Note();
        initialSnapshot = this.note.save();
    }

    public void write(String text){
        note.write(text);
    }

    public void read(){
        note.read();
    }

    public void save(){
        userNoteHistory.add(note.save());
    }

    public void undo(){
        Memento<Note> snapNote = userNoteHistory.poll();
        if(!Objects.isNull(snapNote))
            note.restore(snapNote);
        else
            note.restore(initialSnapshot);
    }
}
