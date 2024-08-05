package structural.flyweight.implementation;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
    private static final Map<String, FlyWeightImage> flyWeightImageMap = new HashMap<>();
    private FlyWeightFactory(){}

    public static void addImage(String imageKey, String imageLocation){
        if(!flyWeightImageMap.containsKey(imageKey))
            flyWeightImageMap.put(imageKey, new FlyWeightImage(imageLocation));
    }

    public static FlyWeightImage getImage(String imageKey){
        return flyWeightImageMap.get(imageKey);
    }
}
