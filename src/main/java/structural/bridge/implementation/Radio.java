package structural.bridge.implementation;

public class Radio extends Device {
    private int volume;
    private int currentChannelIndex;
    private boolean isOn;
    private final RadioChannel[] channels;
    public Radio(RadioChannel[] channels){
        this.channels = channels;
        volume = 20;
    }
    @Override
    public Channel getCurrentChannel() {
        return channels[currentChannelIndex];
    }

    @Override
    public void next() {
        checkRadioOnStatus();
        play(channels[++currentChannelIndex]);
    }

    @Override
    public void previous() {
        checkRadioOnStatus();
        play(channels[--currentChannelIndex]);
    }

    @Override
    public int getVolume() {
        checkRadioOnStatus();
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        checkRadioOnStatus();
        this.volume = volume;
    }

    private void checkRadioOnStatus(){
        if(!isOn)
            throw new RuntimeException("TV is switched off!");
    }
}
