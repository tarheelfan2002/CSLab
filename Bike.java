public class Bike extends LandTransportation {
    public int gearCount;

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public int getGearCount() {
        return this.gearCount;
    }

    public String toString() {
        return String.format(
                "Vehicle type: %s\nRental or ticket: %s\nPrice: %f\nSpots available %d\nSpeed: %f\nTerrain: %s\nLocation: %s\nPickup time: %s\nMinutes of travel time: %d\nWheel count: %d\nGear count: %d\n",
                this.getVehicleType(),
                this.getServiceType(),
                this.getPrice(),
                this.getPassengerSpace(),
                this.getSpeed(),
                this.getTerrain(),
                this.getLocation(),
                this.getPickupTime(),
                this.getTravelTimeMins(),
                this.getWheelCount(),
                this.getGearCount()
        );
    }

    Bike(double price, int passengerSpace, double speed, String location, String pickupTime, int travelTime) {
        this.setVehicleType("Bike");
        this.setServiceType("Rental");
        this.setPrice(price);
        this.setPassengerSpace(passengerSpace);
        this.setSpeed(speed);
        this.setTerrain("Land");
        this.setLocation(location);
        this.setPickupTime(pickupTime);
        this.setTravelTimeMins(travelTime);
        this.setWheelCount(2);
        this.setGearCount(9);
    }
}
