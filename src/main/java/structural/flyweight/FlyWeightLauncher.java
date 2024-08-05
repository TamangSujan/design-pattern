package structural.flyweight;

import structural.flyweight.implementation.FlyWeightFactory;
import structural.flyweight.implementation.FlyWeightImage;

import java.util.LinkedList;
import java.util.List;

public class FlyWeightLauncher {
    public static void main(String[] args) {
        FlyWeightFactory.addImage("king", "king.png");

        List<FlyWeightImage> kings = new LinkedList<>();
        for(int index=0; index<100; index++){
            kings.add(FlyWeightFactory.getImage("king"));
        }
        for(FlyWeightImage king: kings){
            System.out.println(king);
        }
    }
}
