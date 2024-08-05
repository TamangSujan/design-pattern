package structural.composite.implementation;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Box {
    private final List<Item> items;
    private final List<Box> boxes;

    public Box(List<Item> items, List<Box> boxes){
        if(Objects.isNull(boxes))
            this.boxes = new LinkedList<>();
        else
            this.boxes = boxes;
        if(Objects.isNull(items))
            this.items = new LinkedList<>();
        else
            this.items = items;
    }
    public double getTotalPrice(){
        double total = 0;
        for(Item item: items){
            total += item.getPrice();
        }
        for(Box box: boxes){
            total += box.getTotalPrice();
        }
        return total;
    }
}
