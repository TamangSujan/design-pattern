package structural.bridge;

import structural.bridge.implementation.*;

import java.util.LinkedList;
import java.util.List;

public class BridgeLauncher {
    public static void main(String[] args) {
        Device tv = new TV(getTvChannels());
        Device radio = new Radio(getRadioChannels());
        Remote tvRemote = new MasterRemote(tv);
        Remote radioRemote = new MasterRemote(radio);

        tvRemote.power();
        radioRemote.power();

        tvRemote.increaseVolume();
        tvRemote.nextChannel();

        tvRemote.power();
        tvRemote.decreaseVolume();
    }

    private static TVChannel[] getTvChannels(){
        List<TVChannel> channels = new LinkedList<>();
        channels.add(new TVChannel("Nepal Television"));
        channels.add(new TVChannel("Cartoon Network"));
        channels.add(new TVChannel("9XM"));
        channels.add(new TVChannel("Nickelodeon"));
        channels.add(new TVChannel("Disney"));
        return channels.toArray(new TVChannel[0]);
    }

    private static RadioChannel[] getRadioChannels(){
        List<RadioChannel> channels = new LinkedList<>();
        channels.add(new RadioChannel("Image FM"));
        channels.add(new RadioChannel("Nepal FM"));
        return channels.toArray(new RadioChannel[0]);
    }
}
