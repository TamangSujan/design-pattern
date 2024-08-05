package structural.decorator;

import structural.decorator.implementation.Cloth;
import structural.decorator.implementation.Decorator;

public class DecoratorLauncher {
    public static void main(String[] args) {
        Decorator innerVest = new Decorator(new Cloth("Inner Vest"));
        Decorator shirt = new Decorator(new Cloth("Shirt"));
        shirt.decorate(innerVest);
        Decorator jacket = new Decorator(new Cloth("Jacket"));
        jacket.decorate(shirt);

        jacket.showDecoration();
    }
}
