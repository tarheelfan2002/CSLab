public class HotAirBalloon extends AirTransportation {
    public String gasType;

    public void setGasType(String gasType) {
        this.gasType = gasType;
    }

    public String getGasType() {
        return this.gasType;
    }

    public String toString() {
        return String.format(
                "Vehicle type: %s\nRental or ticket: %s\nPrice: %f\nSpots available %d\nSpeed: %f\nTerrain: %s\nLocation: %s\nPickup time: %s\nMinutes of travel time: %d\nElevation: %d\nGas type: %s\n",
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
                this.getGasType()
        );
    }

    HotAirBalloon(double price, int passengerSpace, double speed, String location, String pickupTime, int travelTime) {
        this.setVehicleType("Hot Air Balloon");
        this.setServiceType("Ticket");
        this.setPrice(price);
        this.setPassengerSpace(passengerSpace);
        this.setSpeed(speed);
        this.setTerrain("Air");
        this.setLocation(location);
        this.setPickupTime(pickupTime);
        this.setTravelTimeMins(travelTime);
        this.setElevation(1000);
        this.setGasType("Methane");
    }
}
