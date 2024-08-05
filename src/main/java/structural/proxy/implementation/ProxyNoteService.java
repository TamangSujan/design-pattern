package structural.proxy.implementation;

public class ProxyNoteService {
    private final UserNote userNote;
    public ProxyNoteService(String user){
        UserNote databaseUserNote = Database.getNote(user);
        userNote = new UserNote(databaseUserNote.getUser(), databaseUserNote.getDescription());
    }

    public UserNote getUserNote(){
        System.out.println("Calling from note service!");
        return userNote;
    }

    public void updateUserNote(String description){
        System.out.println("Calling from note service!");
        Database.saveNote(userNote.getUser(), description);
        userNote.setDescription(description);
    }
}
