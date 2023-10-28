public class Helicopter extends AirTransportation {
    public int bladeCount;

    public void setBladeCount(int bladeCount) {
        this.bladeCount = bladeCount;
    }

    public int getBladeCount() {
        return this.bladeCount;
    }

    public String toString() {
        return String.format(
                "Vehicle type: %s\nRental or ticket: %s\nPrice: %f\nSpots available %d\nSpeed: %f\nTerrain: %s\nLocation: %s\nPickup time: %s\nMinutes of travel time: %d\nElevation: %d\nBlade count: %d\n",
                this.getVehicleType(),
                this.getServiceType(),
                this.getPrice(),
                this.getPassengerSpace(),
                this.getSpeed(),
                this.getTerrain(),
                this.getLocation(),
                this.getPickupTime(),
                this.getTravelTimeMins(),
                this.getElevation(),
                this.getBladeCount()
        );
    }

    Helicopter(double price, int passengerSpace, double speed, String location, String pickupTime, int travelTime) {
        this.setVehicleType("Helicopter");
        this.setServiceType("Rental");
        this.setPrice(price);
        this.setPassengerSpace(passengerSpace);
        this.setSpeed(speed);
        this.setTerrain("Air");
        this.setLocation(location);
        this.setPickupTime(pickupTime);
        this.setTravelTimeMins(travelTime);
        this.setElevation(500);
        this.setBladeCount(4);
    }
}
