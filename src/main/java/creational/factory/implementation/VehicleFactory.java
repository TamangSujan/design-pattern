package creational.factory.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class VehicleFactory {
    private static VehicleFactory vehicleFactory;
    private final Map<VehicleType, Vehicle> vehicleMap;
    private VehicleFactory(){
        vehicleMap = new HashMap<>();
        vehicleMap.put(VehicleType.MOTORCYCLE, new Motorcycle());
        vehicleMap.put(VehicleType.TRUCK, new Truck());
    }
    public static Vehicle build(VehicleType type){
        if(Objects.isNull(vehicleFactory))
            vehicleFactory = new VehicleFactory();
        return vehicleFactory.vehicleMap.get(type);
    }
}
