package behaviour.iterator.implementation.list;

public class BLinkedListNode<T> {
    private final T data;
    private BLinkedListNode<T> next;

    public BLinkedListNode(T data){
        this.data = data;
    }

    public T getData(){
        return data;
    }

    public BLinkedListNode<T> getNext(){
        return next;
    }

    public void setNext(BLinkedListNode<T> next){
        this.next = next;
    }
}
