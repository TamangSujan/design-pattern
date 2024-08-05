package structural.proxy.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Database {
    private static final Map<String, UserNote> userNotes = new HashMap<>();
    private Database(){}

    public static void saveNote(String name, String description){
        System.err.println("Calling from database: SAVE!");
        UserNote userNote = userNotes.get(name);
        if(Objects.isNull(userNote)){
            userNotes.put(name, new UserNote(name, description));
            return;
        }
        userNote.setDescription(description);
    }
    public static UserNote getNote(String user){
        System.err.println("Calling from database: GET!");
        return userNotes.get(user);
    }
}
