package behaviour.iterator.implementation.iterator;

import java.util.Objects;

public class BiteratorImpl<T> implements Biterator<T> {
    private BiteratorItem<T> head;
    private BiteratorItem<T> tail;
    public BiteratorImpl(){}

    public void add(T data){
        BiteratorItem<T> newItem = new BiteratorItem<>(data);
        if(Objects.isNull(head)) {
            head = newItem;
            tail = newItem;
        }else if(Objects.isNull(head.getNext())){
            head.setNext(newItem);
            tail = newItem;
        }else{
            tail.setNext(newItem);
            tail = newItem;
        }
    }

    @Override
    public boolean hasNext() {
        return head != null;
    }

    @Override
    public T next() {
        T next = head.getData();
        head = head.getNext();
        return next;
    }
}
