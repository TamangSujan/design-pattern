package creational.abstract_factory;

import creational.abstract_factory.implementation.*;

public class AbstractFactoryLauncher {
    public static void main(String[] args) {
        FurnitureFactory nepaliFactory = AbstractFurnitureFactory.build(FurnitureExporter.NEPALI);
        Furniture nepaliChair = nepaliFactory.build(FurnitureType.CHAIR);
        Furniture nepaliSofa = nepaliFactory.build(FurnitureType.SOFA);

        FurnitureFactory indianFactory = AbstractFurnitureFactory.build(FurnitureExporter.INDIAN);
        Furniture indianChair = indianFactory.build(FurnitureType.CHAIR);
        Furniture indianSofa = indianFactory.build(FurnitureType.SOFA);

        FurnitureFactory chineseFactory = AbstractFurnitureFactory.build(FurnitureExporter.CHINESE);
        Furniture chineseChair = chineseFactory.build(FurnitureType.CHAIR);
        Furniture chineseSofa = chineseFactory.build(FurnitureType.SOFA);

        System.out.println(nepaliChair.name());
        System.out.println(nepaliSofa.name());
        System.out.println(indianChair.name());
        System.out.println(indianSofa.name());
        System.out.println(chineseChair.name());
        System.out.println(chineseSofa.name());
    }
}
