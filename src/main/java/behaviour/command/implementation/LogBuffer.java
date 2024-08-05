package behaviour.command.implementation;

public class LogBuffer {
    private String buffer;
    public LogBuffer(){
        buffer = "";
    }

    public String getBuffer(){
        return buffer;
    }
    public void setBuffer(String buffer){
        this.buffer = buffer;
    }
}
