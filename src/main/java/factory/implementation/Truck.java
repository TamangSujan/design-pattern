package factory.implementation;

class Truck implements Vehicle {
    @Override
    public void transport() {
        System.out.println("Transporting from Truck...");
    }
}
