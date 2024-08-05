package creational.singleton;

import creational.singleton.implementation.Singleton;

public class SingletonLauncher {
    public static void main(String[] args) {
        Singleton s1 = Singleton.get();
        Singleton s2 = Singleton.get();
        System.out.println(s1);
        System.out.println(s2);
    }
}
