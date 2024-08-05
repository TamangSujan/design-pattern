package structural.decorator.implementation;

import java.util.Objects;

public class Decorator {
    private final Cloth cloth;
    private Decorator child;
    public Decorator(Cloth cloth){
        this.cloth = cloth;
    }

    public void decorate(Decorator decorator){
        this.child = decorator;
    }
    public void showDecoration(){
        if(!Objects.isNull(child))
            child.showDecoration();
        if(!Objects.isNull(cloth))
            System.out.println(cloth.getName());
    }
}
