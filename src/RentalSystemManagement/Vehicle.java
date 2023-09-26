package RentalSystemManagement;

    public abstract class Vehicle {
        private String vehicleId;
        private String brand;
        private String model;
        private double basePricePerDay;
        private boolean isAvailable;

        public Vehicle(String vehicleId, String brand, String model, double basePricePerDay) {
            this.vehicleId = vehicleId;
            this.brand = brand;
            this.model = model;
            this.basePricePerDay = basePricePerDay;
            this.isAvailable = true;
        }

        public String getVehicleId() {
            return vehicleId;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public double calculatePrice(int rentalDays) {
            return basePricePerDay * rentalDays;
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        public void rent() {
            isAvailable = false;
        }

        public void returnVehicle() {
            isAvailable = true;
        }
        public abstract String getType();

    }
