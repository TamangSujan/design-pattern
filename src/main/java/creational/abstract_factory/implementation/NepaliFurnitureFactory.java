package creational.abstract_factory.implementation;

import java.util.HashMap;
import java.util.Map;

class NepaliFurnitureFactory implements FurnitureFactory{
    private final Map<FurnitureType, Furniture> furnitureMap;
    NepaliFurnitureFactory(){
        furnitureMap = new HashMap<>();
        furnitureMap.put(FurnitureType.CHAIR, new NepaliChair());
        furnitureMap.put(FurnitureType.SOFA, new NepaliSofa());
    }

    public Furniture build(FurnitureType type){
        return furnitureMap.get(type);
    }
}
