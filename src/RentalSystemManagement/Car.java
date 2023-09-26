package RentalSystemManagement;

public class Car extends Vehicle {
    public Car(String vehicleId, String brand, String model, double basePricePerDay) {
        super(vehicleId, brand, model, basePricePerDay);
    }
    @Override
    public String getType() {
        return "Car";
    }
}
