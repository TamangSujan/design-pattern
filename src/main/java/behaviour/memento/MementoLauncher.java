package behaviour.memento;

import behaviour.memento.implementation.NoteApplication;

public class MementoLauncher {
    public static void main(String[] args) {
        NoteApplication application = new NoteApplication();
        application.write("Hi");
        application.write(", my name is sujan!");
        application.read();
        application.undo();
        application.read();
        application.write("Hi");
        application.write(", my name is sujan!");
        application.save();
        application.write("I am adding another text");
        application.read();
        application.undo();
        application.read();
    }
}
