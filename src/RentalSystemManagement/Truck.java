package RentalSystemManagement;

public class Truck extends Vehicle {
    private double cargoCapacity; // Additional property for trucks

    public Truck(String vehicleId, String brand, String model, double basePricePerDay, double cargoCapacity) {
        super(vehicleId, brand, model, basePricePerDay);
        this.cargoCapacity = cargoCapacity;
    }
    public double getCargoCapacity() {
        return cargoCapacity;
    }
    @Override
    public String getType() {
        return "Truck";
    }
}