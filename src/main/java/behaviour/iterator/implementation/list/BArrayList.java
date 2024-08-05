package behaviour.iterator.implementation.list;

import behaviour.iterator.implementation.iterator.Biterator;
import behaviour.iterator.implementation.iterator.BiteratorImpl;

public class BArrayList<T> {
    private BArrayListNode<T>[] nodes;
    private int currentIndex;
    private int size;
    public BArrayList(int size){
        nodes = new BArrayListNode[size];
        currentIndex = 0;
        this.size = size;
    }
    public void add(T data){
        if(currentIndex < size)
            nodes[currentIndex++] = new BArrayListNode<>(data);
    }
    public Biterator<T> getIterator(){
        BiteratorImpl<T> iterator = new BiteratorImpl<>();
        for(BArrayListNode<T> node: nodes){
            iterator.add(node.getData());
        }
        return iterator;
    }
}
