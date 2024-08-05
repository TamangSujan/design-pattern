package structural.bridge.implementation;

public interface Remote {
    Device getDevice();
    void increaseVolume();
    void decreaseVolume();
    void nextChannel();
    void previousChannel();
    void power();
}
