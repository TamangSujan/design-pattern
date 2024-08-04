package creational.abstract_factory.implementation;

import java.util.HashMap;
import java.util.Map;

class IndianFurnitureFactory implements FurnitureFactory{
    private final Map<FurnitureType, Furniture> furnitureMap;
    IndianFurnitureFactory(){
        furnitureMap = new HashMap<>();
        furnitureMap.put(FurnitureType.CHAIR, new IndianChair());
        furnitureMap.put(FurnitureType.SOFA, new IndianSofa());
    }

    public Furniture build(FurnitureType type){
        return furnitureMap.get(type);
    }
}
