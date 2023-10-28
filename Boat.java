public class Boat extends WaterTransportation {
    public String movementType;

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    public String getMovementType() {
        return this.movementType;
    }

    public String toString() {
        return String.format(
                "Vehicle type: %s\nRental or ticket: %s\nPrice: %f\nSpots available %d\nSpeed: %f\nTerrain: %s\nLocation: %s\nPickup time: %s\nMinutes of travel time: %d\nDepth: %d\nNuclear warheads: %s\n",
                this.getVehicleType(),
                this.getServiceType(),
                this.getPrice(),
                this.getPassengerSpace(),
                this.getSpeed(),
                this.getTerrain(),
                this.getLocation(),
                this.getPickupTime(),
                this.getTravelTimeMins(),
                this.getDepth(),
                this.getMovementType()
        );
    }

    Boat(double price, int passengerSpace, double speed, String location, String pickupTime, int travelTime) {
        this.setVehicleType("Boat");
        this.setServiceType("Rental");
        this.setPrice(price);
        this.setPassengerSpace(passengerSpace);
        this.setSpeed(speed);
        this.setTerrain("Water");
        this.setLocation(location);
        this.setPickupTime(pickupTime);
        this.setTravelTimeMins(travelTime);
        this.setDepth(0);
        this.setMovementType("Oars");
    }
}
