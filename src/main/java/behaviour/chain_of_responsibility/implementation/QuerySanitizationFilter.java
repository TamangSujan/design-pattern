package behaviour.chain_of_responsibility.implementation;

public class QuerySanitizationFilter implements Filter{
    @Override
    public void filter(String request, FilterChain chain) {
        System.out.println("Query Sanitization Filter");
        //chain.chain(request);
    }
}
