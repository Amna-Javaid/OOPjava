package RentalSystemManagement;

import java.util.Scanner;

public class RentalSystem {
    private Vehicle[] vehicles; // Changed to store all types of vehicles
    private Customer[] customers;
    private Rental[] rentals;
    private int vehicleCount;
    private int customerCount;
    private int rentalCount;

    public RentalSystem(int maxVehicles, int maxCustomers) {
        vehicles = new Vehicle[maxVehicles];
        customers = new Customer[maxCustomers];
        rentals = new Rental[maxVehicles]; // Assume one rental per vehicle
        vehicleCount = 0;
        customerCount = 0;
        rentalCount = 0;
    }
    public void addVehicle(Vehicle vehicle) {
        if (vehicleCount < vehicles.length) {
            vehicles[vehicleCount] = vehicle;
            vehicleCount++;
        } else {
            System.out.println("Vehicle inventory is full.");
        }
    }
    public void rentVehicle(Vehicle vehicle, Customer customer, int days) {
        if (vehicle.isAvailable()) {
            vehicle.rent();
            if (rentalCount < rentals.length) {
                rentals[rentalCount] = new Rental(vehicle, customer, days);
                rentalCount++;
            } else {
                System.out.println("Rental capacity reached. Cannot rent the vehicle.");
            }
        } else {
            System.out.println("Vehicle is not available for rent.");
        }
    }

    public void returnVehicle(Vehicle vehicle) {
        vehicle.returnVehicle();
        for (int i = 0; i < rentalCount; i++) {
            if (rentals[i].getVehicle() == vehicle) {
                // Remove the rental record by shifting elements
                for (int j = i; j < rentalCount - 1; j++) {
                    rentals[j] = rentals[j + 1];
                }
                rentalCount--;
                return;
            }
        }
        System.out.println("Vehicle was not rented.");
    }
    public void addCustomer(Customer customer) {
        if (customerCount < customers.length) {
            customers[customerCount] = customer;
            customerCount++;
        } else {
            System.out.println("Customer list is full.");
        }
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== Vehicle Rental System =====");
            System.out.println("1. Rent a Vehicle");
            System.out.println("2. Return a Vehicle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.println("\n== Rent a Vehicle ==\n");
                System.out.print("Enter your name: ");
                String customerName = scanner.nextLine();

                System.out.println("\nAvailable Vehicles:");
                for (int i = 0; i < vehicleCount; i++) {
                    Vehicle vehicle = vehicles[i];
                    if (vehicle.isAvailable()) {
                        System.out.println(vehicle.getVehicleId() + " - " + vehicle.getBrand() + " " + vehicle.getModel()
                                + " (" + vehicle.getType() + ")");
                    }
                }

                System.out.print("\nEnter the vehicle ID you want to rent: ");
                String vehicleId = scanner.nextLine();

                System.out.print("Enter the number of days for rental: ");
                int rentalDays = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                String customerID = "CUS" + (customerCount + 1);
                customerCount++;

                Customer newCustomer = new Customer(customerID, customerName);
                addCustomer(newCustomer);

                Vehicle selectedVehicle = null;
                for (int i = 0; i < vehicleCount; i++) {
                    Vehicle vehicle = vehicles[i];
                    if (vehicle.getVehicleId().equals(vehicleId) && vehicle.isAvailable()) {
                        selectedVehicle = vehicle;
                        break;
                    }
                }

                if (selectedVehicle != null) {
                    double totalPrice = selectedVehicle.calculatePrice(rentalDays);
                    System.out.println("\n== Rental Information ==\n");
                    System.out.println("Customer ID: " + newCustomer.getCustomerId());
                    System.out.println("Customer Name: " + newCustomer.getName());
                    System.out.println("Vehicle: " + selectedVehicle.getBrand() + " " + selectedVehicle.getModel()
                            + " (" + selectedVehicle.getType() + ")");
                    System.out.println("Rental Days: " + rentalDays);
                    System.out.printf("Total Price: $%.2f%n", totalPrice);

                    System.out.print("\nConfirm rental (Y/N): ");
                    String confirm = scanner.nextLine();

                    if (confirm.equalsIgnoreCase("Y")) {
                        rentVehicle(selectedVehicle, newCustomer, rentalDays);
                        System.out.println("\nVehicle rented successfully.");
                    } else {
                        System.out.println("\nRental canceled.");
                    }
                } else {
                    System.out.println("\nInvalid vehicle selection or vehicle not available for rent.");
                }

            } else if (choice == 2) {
                System.out.println("\n== Return a Vehicle ==\n");
                System.out.print("Enter the vehicle ID you want to return: ");
                String vehicleId = scanner.nextLine();

                Vehicle vehicleToReturn = null;
                for (Vehicle vehicle : vehicles) {
                    if (vehicle != null && vehicle.getVehicleId().equals(vehicleId) && !vehicle.isAvailable()) {
                        vehicleToReturn = vehicle;
                        break;
                    }
                }

                if (vehicleToReturn != null) {
                    Customer customer = null;
                    for (Rental rental : rentals) {
                        if (rental.getVehicle() != null && rental.getVehicle() == vehicleToReturn) {
                            customer = rental.getCustomer();
                            break;
                        }
                    }
                    if (customer != null) {
                        returnVehicle(vehicleToReturn);
                        System.out.println("Vehicle returned successfully by " + customer.getName());
                    } else {
                        System.out.println("Vehicle was not rented or rental information is missing.");
                    }
                } else {
                    System.out.println("Invalid vehicle ID or vehicle is not rented.");
                }

            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        System.out.println("\nThank you for using the Vehicle Rental System!");
    }


}
