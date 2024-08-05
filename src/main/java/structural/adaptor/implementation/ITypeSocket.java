package structural.adaptor.implementation;

public class ITypeSocket extends ElectricSocket {
    private final Charge charge = new Charge(20);

    @Override
    public void connect(Plug plug) {
        if(PlugType.I.equals(plug.getPlugType())) {
            System.out.println("Connected I Plug Type");
            this.plug = plug;
        }
        else
            System.out.println("Incompatible Plug Type");
    }

    @Override
    public Charge getCharge() {
        return charge;
    }
}
