package structural.facade.implementation;

public class AtmInitializer {
    private AtmInitializer(){}
    public static void loadData(){
        AtmDatabase.addUser("Ram");
        AtmDatabase.save("Ram", 20_000);
    }
}
