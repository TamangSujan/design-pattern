package structural.proxy.implementation;

public class DatabaseInitializer {
    public static void initialize(){
        Database.saveNote("Sujan", "This is some description!");
    }
}
