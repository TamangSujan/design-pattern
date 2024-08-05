package behaviour.command.implementation;

public class LogHandler {
    private static final StringBuilder logBuffer = new StringBuilder();
    public static void save(String log){
        logBuffer.append(log).append("\n");
    }

    public static void read(){
        System.out.println(logBuffer);
    }
}
