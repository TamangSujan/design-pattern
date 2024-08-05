package behaviour.iterator.implementation.list;

import behaviour.iterator.implementation.iterator.Biterator;
import behaviour.iterator.implementation.iterator.BiteratorImpl;

import java.util.Objects;

public class BLinkedList<T> {
    private BLinkedListNode<T> head;
    private BLinkedListNode<T> tail;
    public void add(T data){
        BLinkedListNode<T> newNode = new BLinkedListNode<>(data);
        if(Objects.isNull(head)) {
            head = newNode;
            tail = newNode;
        }else if(Objects.isNull(head.getNext())){
            head.setNext(newNode);
            tail = newNode;
        }else{
            tail.setNext(newNode);
            tail = newNode;
        }
    }
    public Biterator<T> getIterator(){
        BiteratorImpl<T> iterator = new BiteratorImpl<>();
        BLinkedListNode<T> tempHead = head;
        while(tempHead != null){
            iterator.add(tempHead.getData());
            tempHead = tempHead.getNext();
        }
        return iterator;
    }
}
