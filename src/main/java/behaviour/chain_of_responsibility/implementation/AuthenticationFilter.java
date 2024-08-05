package behaviour.chain_of_responsibility.implementation;

public class AuthenticationFilter implements Filter{
    @Override
    public void filter(String request, FilterChain chain) {
        System.out.println("Authentication Filter");
        chain.chain(request);
    }
}
