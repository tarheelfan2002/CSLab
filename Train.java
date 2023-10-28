public class Train extends LandTransportation {
    public int carriageCount;

    public void setCarriageCount(int carriageCount) {
        this.carriageCount = carriageCount;
    }

    public int getCarriageCount() {
        return this.carriageCount;
    }

    public String toString() {
        return String.format(
                "Vehicle type: %s\nRental or ticket: %s\nPrice: %f\nSpots available %d\nSpeed: %f\nTerrain: %s\nLocation: %s\nPickup time: %s\nMinutes of travel time: %d\nWheel count: %d\nCarriage count: %d\n",
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
                this.getCarriageCount()
        );
    }

    Train(double price, int passengerSpace, double speed, String location, String pickupTime, int travelTime) {
        this.setVehicleType("Train");
        this.setServiceType("Ticket");
        this.setPrice(price);
        this.setPassengerSpace(passengerSpace);
        this.setSpeed(speed);
        this.setTerrain("Land");
        this.setLocation(location);
        this.setPickupTime(pickupTime);
        this.setTravelTimeMins(travelTime);
        this.setWheelCount(18);
        this.setCarriageCount(3);
    }
}
