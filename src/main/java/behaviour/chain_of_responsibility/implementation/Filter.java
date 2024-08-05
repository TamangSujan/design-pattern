package behaviour.chain_of_responsibility.implementation;

public interface Filter {
    void filter(String request, FilterChain chain);
}
