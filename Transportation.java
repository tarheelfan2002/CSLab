public class Transportation {

    private String vehicleType;
    private String[] options;
    private String serviceType;
    private double price;
    private int passengerSpace;
    private double speed;
    private String terrain;
    private String location;
    private String pickupTime;
    private int travelTimeMins;

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPassengerSpace(int passengerSpace) {
        this.passengerSpace = passengerSpace;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPickupTime(String pickupTime) {
        this.pickupTime = pickupTime;
    }

    public void setTravelTimeMins(int travelTimeMins) {
        this.travelTimeMins = travelTimeMins;
    }

    public String getVehicleType() {
        return this.vehicleType;
    }

    public double getPrice() {
        return this.price;
    }

    public String getServiceType() {
        return this.serviceType;
    }

    public double getSpeed() {
        return this.speed;
    }

    public int getPassengerSpace() {
        return this.passengerSpace;
    }

    public int getTravelTimeMins() {
        return this.travelTimeMins;
    }

    public String getLocation() {
        return this.location;
    }

    public String getPickupTime() {
        return this.pickupTime;
    }

    public String getTerrain() {
        return this.terrain;
    }

    public String[] getOptions() {
        return this.options;
    }

    public String toString() {
        return String.format(
                "Vehicle type: %s\nRental or ticket: %s\nPrice: %f\nSpots available %d\nSpeed: %f\nTerrain: %s\nLocation: %s\nPickup time: %s\nMinutes of travel time: %d\n",
                this.getVehicleType(),
                this.getServiceType(),
                this.getPrice(),
                this.getPassengerSpace(),
                this.getSpeed(),
                this.getTerrain(),
                this.getLocation(),
                this.getPickupTime(),
                this.getTravelTimeMins()
        );
    }

    public void showOptions() {
        System.out.println("Vehicle options:\n");
        for (String option : this.getOptions()) {
            System.out.printf("%s\n", option);
        }
    }
}
