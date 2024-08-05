package structural.adaptor.implementation;

public abstract class Plug {
    private Charge charge;
    public abstract int getRequiredVolt();
    public abstract String getManufacturer();
    public abstract PlugType getPlugType();
    public Charge getCharge(){
        return charge;
    };
    public void receiveCharge(Charge charge){
        int receivedVolt = charge.getVolt();
        if(receivedVolt != getRequiredVolt()){
            throw new RuntimeException("Unequal Voltage: Required " + getRequiredVolt() + " | Sent " + receivedVolt);
        }
        System.out.println("Received charge to "+getManufacturer() + " Plug Type");
        this.charge = charge;
    }
}
