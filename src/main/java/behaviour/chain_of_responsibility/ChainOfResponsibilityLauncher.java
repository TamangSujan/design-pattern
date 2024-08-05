package behaviour.chain_of_responsibility;

import behaviour.chain_of_responsibility.implementation.AuthenticationFilter;
import behaviour.chain_of_responsibility.implementation.AuthorizationFilter;
import behaviour.chain_of_responsibility.implementation.FilterChain;
import behaviour.chain_of_responsibility.implementation.QuerySanitizationFilter;

public class ChainOfResponsibilityLauncher {
    public static void main(String[] args) {
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new QuerySanitizationFilter());
        filterChain.addFilter(new AuthenticationFilter());
        filterChain.addFilter(new AuthorizationFilter());
        filterChain.chain("Request");
    }
}
