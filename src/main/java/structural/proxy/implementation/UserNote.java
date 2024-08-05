package structural.proxy.implementation;

public class UserNote {
    private String user;
    private String description;
    public UserNote(String user, String description){
        this.user = user;
        this.description = description;
    }

    public String getUser(){
        return user;
    }

    public void setUser(String user){
        this.user = user;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}
