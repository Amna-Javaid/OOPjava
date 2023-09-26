package RentalSystemManagement;

public class Main {
    public static void main(String[] args) {
        RentalSystem rentalSystem = new RentalSystem(10, 10);

        // Create car instances
        Car car1 = new Car("C001", "Toyota", "Camry", 60.0);
        Car car2 = new Car("C002", "Honda", "Accord", 70.0);
        Car car3 = new Car("C003", "Mahindra", "Thar", 150.0);
        Truck truck1 = new Truck("T001", "Ford", "F-150", 80.0, 1500.0);
        Truck truck2 = new Truck("T002", "Chevrolet", "Silverado", 140.0, 2500.0);

        // Add cars to the rental system
        rentalSystem.addVehicle(car1);
        rentalSystem.addVehicle(car2);
        rentalSystem.addVehicle(car3);
        rentalSystem.addVehicle(truck1);
        rentalSystem.addVehicle(truck2);

        rentalSystem.menu();

    }
}
