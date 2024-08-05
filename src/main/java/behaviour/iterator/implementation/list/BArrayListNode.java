package behaviour.iterator.implementation.list;

public class BArrayListNode<T> {
    private final T data;
    public BArrayListNode(T data){
        this.data = data;
    }
    public T getData(){
        return data;
    }
}
