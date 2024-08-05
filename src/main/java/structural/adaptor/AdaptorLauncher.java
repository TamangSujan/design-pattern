package structural.adaptor;

import structural.adaptor.implementation.*;

public class AdaptorLauncher {
    public static void main(String[] args) {
        ElectricSocket fSocket = new FTypeSocket();
        ElectricSocket iSocket = new ITypeSocket();

        Plug fPlug = new FTypePlug();
        Plug iPlug = new ITypePlug();

        fSocket.connect(fPlug);
        iSocket.connect(iPlug);

        fSocket.sendCharge();
        iSocket.sendCharge();

        FTypeSocket fSocket2 = new FTypeSocket();
        ITypePlug iPlug2 = new ITypePlug();

        fSocket2.connect(iPlug2);

        FTypeIPlugAdaptor fTypeAdaptor = new FTypeIPlugAdaptor(fSocket2, iPlug2);
        fTypeAdaptor.sendCharge();
    }
}
