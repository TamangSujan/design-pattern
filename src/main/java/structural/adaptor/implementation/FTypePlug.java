package structural.adaptor.implementation;

public class FTypePlug extends Plug{
    @Override
    public int getRequiredVolt() {
        return 25;
    }

    @Override
    public String getManufacturer() {
        return "F";
    }

    @Override
    public PlugType getPlugType() {
        return PlugType.F;
    }
}
