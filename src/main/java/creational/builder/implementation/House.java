package creational.builder.implementation;

import creational.builder.utils.BooleanUtils;

public class House {
    private boolean windows;
    private boolean doors;
    private boolean walls;
    private boolean roof;
    private boolean garage;
    private boolean swimmingPool;
    private boolean fancyStatues;
    private boolean garden;
    public String toString(){
        return "Roof: " + BooleanUtils.getYesOrNo(roof) + "\n" +
                "Walls: " + BooleanUtils.getYesOrNo(walls) + "\n" +
                "Windows: " + BooleanUtils.getYesOrNo(windows) + "\n" +
                "Door: " + BooleanUtils.getYesOrNo(doors) + "\n" +
                "Garage: " + BooleanUtils.getYesOrNo(garage) + "\n" +
                "Swimming Pool: " + BooleanUtils.getYesOrNo(swimmingPool) + "\n" +
                "Fancy Statues: " + BooleanUtils.getYesOrNo(fancyStatues) + "\n" +
                "Garden: " + BooleanUtils.getYesOrNo(garden) + "\n";
    }

    private House(){}
    public static HouseBuilder builder(){
        return new HouseBuilder();
    }
    public static class HouseBuilder {
        private final House house;
        public HouseBuilder(){
            house = new House();
            house.roof = true;
            house.walls = true;
            house.doors = true;
            house.windows = true;
        }

        public HouseBuilder buildGarage(){
            house.garage = true;
            return this;
        }
        public HouseBuilder buildSwimmingPool(){
            house.swimmingPool = true;
            return this;
        }
        public HouseBuilder buildFancyStatues(){
            house.fancyStatues = true;
            return this;
        }
        public HouseBuilder buildGarden(){
            house.garden = true;
            return this;
        }
        public House build(){
            return house;
        }
    }
}
