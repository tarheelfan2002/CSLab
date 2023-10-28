public class Plane extends AirTransportation {
    public String propulsionSystem;

    public void setPropulsionSystem(String propulsionSystem) {
        this.propulsionSystem = propulsionSystem;
    }

    public String getPropulsionSystem() {
        return this.propulsionSystem;
    }

    public String toString() {
        return String.format(
                "Vehicle type: %s\nRental or ticket: %s\nPrice: %f\nSpots available %d\nSpeed: %f\nTerrain: %s\nLocation: %s\nPickup time: %s\nMinutes of travel time: %d\nElevation: %d\nPropulsion system: %s\n",
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
                this.getPropulsionSystem()
        );
    }

    Plane(double price, int passengerSpace, double speed, String location, String pickupTime, int travelTime) {
        this.setVehicleType("Plane");
        this.setServiceType("Ticket");
        this.setPrice(price);
        this.setPassengerSpace(passengerSpace);
        this.setSpeed(speed);
        this.setTerrain("Air");
        this.setLocation(location);
        this.setPickupTime(pickupTime);
        this.setTravelTimeMins(travelTime);
        this.setElevation(3000);
        this.setPropulsionSystem("Jet");
    }
}
