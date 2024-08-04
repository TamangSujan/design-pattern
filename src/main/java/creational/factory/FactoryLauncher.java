package creational.factory;

import creational.factory.implementation.Vehicle;
import creational.factory.implementation.VehicleType;
import creational.factory.implementation.VehicleFactory;

public class FactoryLauncher {
    public static void main(String[] args) {
        Vehicle motorbike = VehicleFactory.build(VehicleType.MOTORCYCLE);
        Vehicle truck = VehicleFactory.build(VehicleType.TRUCK);
        motorbike.transport();
        truck.transport();
    }
}
