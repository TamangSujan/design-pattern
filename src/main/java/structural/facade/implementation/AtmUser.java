package structural.facade.implementation;

class AtmUser {
    private String name;
    private double balance;
    private String atmUniqueNumber;
    private String atmPin;
    public AtmUser(String name){
        this.name = name;
        this.balance = 0;
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getAtmUniqueNumber(){
        return atmUniqueNumber;
    }

    public void setAtmUniqueNumber(String atmUniqueNumber){
        this.atmUniqueNumber = atmUniqueNumber;
    }

    public String getAtmPin(){
        return atmPin;
    }

    public void setAtmPin(String atmPin){
        this.atmPin = atmPin;
    }

}
