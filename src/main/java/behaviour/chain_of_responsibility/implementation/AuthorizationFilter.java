package behaviour.chain_of_responsibility.implementation;

public class AuthorizationFilter implements Filter{
    @Override
    public void filter(String request, FilterChain chain) {
        System.out.println("Authorization Filter");
        chain.chain(request);
    }
}
