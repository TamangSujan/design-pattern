package behaviour.strategy.implementation;

public interface Strategy<T, R> {
    R apply(T a, T b);
}
