package factory;

import factory.implementation.Vehicle;
import factory.implementation.VehicleFactory;
import factory.implementation.VehicleType;

public class FactoryLauncher {
    public static void main(String[] args) {
        Vehicle motorbike = VehicleFactory.build(VehicleType.MOTORCYCLE);
        Vehicle truck = VehicleFactory.build(VehicleType.TRUCK);
        motorbike.transport();
        truck.transport();
    }
}
