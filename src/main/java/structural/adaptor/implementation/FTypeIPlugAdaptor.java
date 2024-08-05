package structural.adaptor.implementation;

public class FTypeIPlugAdaptor {
    private final ElectricSocket socket;
    private final Plug plug;
    private final Plug fTypePlug;
    public FTypeIPlugAdaptor(FTypeSocket socket, ITypePlug plug){
        this.socket = socket;
        this.plug = plug;
        fTypePlug = new FTypePlug();
        socket.connect(fTypePlug);
    }
    public void sendCharge(){
        socket.sendCharge();
        Charge charge = fTypePlug.getCharge();
        plug.receiveCharge(new Charge(charge.getVolt() - 5));
    }
}
