package structural.adaptor.implementation;

public class ITypePlug extends Plug{
    @Override
    public int getRequiredVolt() {
        return 20;
    }

    @Override
    public String getManufacturer() {
        return "I";
    }

    @Override
    public PlugType getPlugType() {
        return PlugType.I;
    }
}
