package structural.bridge.implementation;

public class TV extends Device{
    private int volume = 20;
    private int currentChannelIndex = 0;
    private final TVChannel[] channels;
    public TV(TVChannel[] channels){
        this.channels = channels;
    }

    @Override
    public Channel getCurrentChannel() {
        return channels[currentChannelIndex];
    }

    @Override
    public void next() {
        checkTvOnStatus();
        play(channels[++currentChannelIndex]);
    }

    @Override
    public void previous() {
        checkTvOnStatus();
        play(channels[--currentChannelIndex]);
    }

    @Override
    public int getVolume() {
        checkTvOnStatus();
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        checkTvOnStatus();
        this.volume = volume;
    }

    private void checkTvOnStatus(){
        if(!isOn)
            throw new RuntimeException("TV is switched off!");
    }
}
