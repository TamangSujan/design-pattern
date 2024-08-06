package behaviour.template.implementation;

public class ESewaGateway extends Gateway{
    @Override
    public String getUrl() {
        return "https://esewa.com.mp/api";
    }
    @Override
    protected LogResult process(String response) {
        return new LogResult(200, "Success");
    }
}
