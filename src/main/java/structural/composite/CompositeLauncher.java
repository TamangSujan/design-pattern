package structural.composite;

import structural.composite.implementation.Box;
import structural.composite.implementation.Item;

import java.util.List;

public class CompositeLauncher {
    public static void main(String[] args) {
        Box geometryBox = new Box(List.of(new Item("Pen", 20), new Item("Eraser", 10)), null);
        Box purseBox = new Box(List.of(new Item("Student ID", 200)), null);
        Box laptopBox = new Box(List.of(new Item("Laptop", 50000), new Item("Mouse", 1000)), null);
        Box crate = new Box(List.of(new Item("Keyboard", 1000), new Item("Bottle", 500)),
                List.of(laptopBox, geometryBox, purseBox));
        System.out.println(crate.getTotalPrice());
    }
}
