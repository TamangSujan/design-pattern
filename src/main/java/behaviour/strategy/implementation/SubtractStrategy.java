package behaviour.strategy.implementation;

public class SubtractStrategy implements Strategy<Integer, Integer>{
    @Override
    public Integer apply(Integer a, Integer b) {
        return a - b;
    }
}
