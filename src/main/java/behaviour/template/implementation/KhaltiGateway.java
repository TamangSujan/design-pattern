package behaviour.template.implementation;

public class KhaltiGateway extends Gateway{
    @Override
    public String getUrl() {
        return "https://khalti.com.np/api";
    }

    @Override
    protected LogResult process(String response) {
        return new LogResult(404, "Failure");
    }
}
