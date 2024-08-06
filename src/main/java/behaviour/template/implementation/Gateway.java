package behaviour.template.implementation;

import java.time.LocalDateTime;

public abstract class Gateway {
    public abstract String getUrl();
    private String call(){
        return new String(ApiCaller.call(getUrl()));
    }
    protected abstract LogResult process(String response);
    private void saveLog(){
        LogResult result = process(call());
        StringBuffer log = new StringBuffer();
        log.append("API Call Initiated: "+getUrl()).append(" at ").append(LocalDateTime.now()).append("\n")
                .append("Processing Started at ").append(LocalDateTime.now()).append("\n")
                .append("Saved Log at: ").append(LocalDateTime.now()).append("\n");
        System.out.println(log);
        System.out.println(result.getStatus());
        System.out.println(result.getMessage());
    }

    public void transact(){
        saveLog();
    }
}
