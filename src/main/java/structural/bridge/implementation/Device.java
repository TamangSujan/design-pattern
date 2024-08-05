package structural.bridge.implementation;

public abstract class Device {
    boolean isOn;
    public void power(){
        isOn = !isOn;
        if(isOn) {
            System.out.println("Turning On!");
            play(getCurrentChannel());
        }else{
            System.out.println("Turning Off!");
        }
    };
    void play(Channel channel){
        StringBuilder stream = new StringBuilder("Streaming: ");
        for(byte data: channel.getStream()){
            stream.append((char) data);
        }
        System.out.println(stream);
    }
    public abstract Channel getCurrentChannel();
    public abstract void next();
    public abstract void previous();
    public abstract int getVolume();
    public abstract void setVolume(int volume);
}
