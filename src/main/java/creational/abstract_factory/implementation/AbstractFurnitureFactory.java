package creational.abstract_factory.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AbstractFurnitureFactory {
    private final Map<FurnitureExporter, FurnitureFactory> furnitureFactoryMap;
    private static AbstractFurnitureFactory abstractFurnitureFactory;
    private AbstractFurnitureFactory(){
        furnitureFactoryMap = new HashMap<>();
        furnitureFactoryMap.put(FurnitureExporter.NEPALI, new NepaliFurnitureFactory());
        furnitureFactoryMap.put(FurnitureExporter.INDIAN, new IndianFurnitureFactory());
        furnitureFactoryMap.put(FurnitureExporter.CHINESE, new ChineseFurnitureFactory());
    }

    public static FurnitureFactory build(FurnitureExporter exporter){
        if(Objects.isNull(abstractFurnitureFactory))
            abstractFurnitureFactory = new AbstractFurnitureFactory();
        return abstractFurnitureFactory.furnitureFactoryMap.get(exporter);
    }
}
