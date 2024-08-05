package structural.adaptor.implementation;

public class FTypeSocket extends ElectricSocket {
    private final Charge charge = new Charge(25);

    @Override
    public void connect(Plug plug) {
        if(PlugType.F.equals(plug.getPlugType())) {
            System.out.println("Connected F Plug Type");
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
