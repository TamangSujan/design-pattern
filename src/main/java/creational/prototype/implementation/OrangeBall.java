package creational.prototype.implementation;

public class OrangeBall implements Candy{
    private final double price;
    private final String name;
    private final String tasteType;
    public OrangeBall(double price){
        this.price = price;
        name = "Orange Ball";
        tasteType = "Sweet";
    }
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getTasteType() {
        return tasteType;
    }
    @Override
    public Candy cloneCandy() {
        return new OrangeBall(price);
    }
}
