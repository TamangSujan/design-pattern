package creational.builder;

import creational.builder.implementation.House;

public class BuilderLauncher {
    public static void main(String[] args) {
        House simpleHouse = House.builder().build();

        House gardenHouse = House.builder()
                .buildGarden()
                .build();

        House luxuryHouse = House.builder()
                .buildGarden()
                .buildGarage()
                .buildFancyStatues()
                .buildSwimmingPool()
                .build();

        System.out.println(simpleHouse);
        printSeparatorLine();
        System.out.println(gardenHouse);
        printSeparatorLine();
        System.out.println(luxuryHouse);
    }

    private static void printSeparatorLine(){
        System.out.println("--------------------------------------------------");
    }
}
