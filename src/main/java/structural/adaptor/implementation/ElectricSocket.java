package structural.adaptor.implementation;

import java.util.Objects;

public abstract class ElectricSocket {
    Plug plug;
    public void connect(Plug plug){
        this.plug = plug;
    };
    public abstract Charge getCharge();
    public void sendCharge(){
        if(Objects.isNull(plug)) {
            throw new RuntimeException("No any plug connected!");
        }
        plug.receiveCharge(getCharge());
    };
}
