package structural.bridge.implementation;

public class MasterRemote implements Remote{
    private final Device device;
    public MasterRemote(Device device){
        this.device = device;
    }

    @Override
    public Device getDevice() {
        return device;
    }

    @Override
    public void increaseVolume() {
        System.out.println("Volume: "+(device.getVolume() + 1));
        device.setVolume(device.getVolume() + 1);
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Volume: "+(device.getVolume() - 1));
        device.setVolume(device.getVolume()-1);
    }

    @Override
    public void nextChannel() {
        device.next();
    }

    @Override
    public void previousChannel() {
        device.previous();
    }

    @Override
    public void power() {
        device.power();
    }
}
