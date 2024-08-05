package creational.singleton.implementation;

import java.util.Objects;

public class Singleton {
    private static Singleton singleton;
    private Singleton(){}
    public static Singleton get(){
        if(Objects.isNull(singleton))
            singleton = new Singleton();
        return singleton;
    }
}
