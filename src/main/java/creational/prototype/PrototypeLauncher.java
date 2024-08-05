package creational.prototype;

import creational.prototype.implementation.Candy;
import creational.prototype.implementation.OrangeBall;

public class PrototypeLauncher {
    public static void main(String[] args) {
        Candy orangeBallAA = new OrangeBall(2.5);
        Candy orangeBallBA = new OrangeBall(3.5);
        Candy orangeBallAB = orangeBallAA.cloneCandy();
        Candy orangeBallBB = orangeBallBA.cloneCandy();

        System.out.println(orangeBallAA+": " + orangeBallAA.getPrice());
        System.out.println(orangeBallAB+": " + orangeBallAB.getPrice());
        System.out.println(orangeBallBA+": " + orangeBallBA.getPrice());
        System.out.println(orangeBallBB+": " + orangeBallBB.getPrice());
    }
}
