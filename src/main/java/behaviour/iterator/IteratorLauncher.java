package behaviour.iterator;

import behaviour.iterator.implementation.list.BArrayList;
import behaviour.iterator.implementation.list.BLinkedList;
import behaviour.iterator.implementation.iterator.Biterator;

public class IteratorLauncher {
    public static void main(String[] args) {
        BLinkedList<Integer> linkedList = new BLinkedList<>();
        for(int loop=0; loop<10; loop++){
            linkedList.add(loop);
        }
        Biterator<Integer> linkedListIterator = linkedList.getIterator();
        while(linkedListIterator.hasNext()){
            System.out.println(linkedListIterator.next());
        }

        BArrayList<Integer> arrayList = new BArrayList<>(10);
        for(int loop=0; loop<10; loop++){
            arrayList.add(loop);
        }
        Biterator<Integer> arrayListIterator = arrayList.getIterator();
        while(arrayListIterator.hasNext()){
            System.out.println(arrayListIterator.next());
        }
    }
}
