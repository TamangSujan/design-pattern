package structural.bridge.implementation;

import java.nio.charset.StandardCharsets;

public class TVChannel implements Channel{
    private final String name;
    public TVChannel(String name){
        this.name = name;
    }
    @Override
    public byte[] getStream() {
        return name.getBytes(StandardCharsets.UTF_8);
    }
}
