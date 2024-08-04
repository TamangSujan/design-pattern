package creational.abstract_factory.implementation;

import java.util.HashMap;
import java.util.Map;

class ChineseFurnitureFactory implements FurnitureFactory{
    private final Map<FurnitureType, Furniture> furnitureMap;
    ChineseFurnitureFactory(){
        furnitureMap = new HashMap<>();
        furnitureMap.put(FurnitureType.CHAIR, new ChineseChair());
        furnitureMap.put(FurnitureType.SOFA, new ChineseSofa());
    }

    public Furniture build(FurnitureType type){
        return furnitureMap.get(type);
    }
}
