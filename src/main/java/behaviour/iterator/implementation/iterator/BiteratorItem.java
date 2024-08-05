package behaviour.iterator.implementation.iterator;

public class BiteratorItem<T> {
    private final T data;
    private BiteratorItem<T> next;

    public BiteratorItem(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public BiteratorItem<T> getNext() {
        return next;
    }

    public void setNext(BiteratorItem<T> next){
        this.next = next;
    }
}
