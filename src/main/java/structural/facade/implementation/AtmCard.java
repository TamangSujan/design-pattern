package structural.facade.implementation;

public class AtmCard {
    private final String atmUniqueNumber;
    public AtmCard(String atmUniqueNumber){
        this.atmUniqueNumber = atmUniqueNumber;
    }
    public String getAtmUniqueNumber(){
        return atmUniqueNumber;
    }
}
