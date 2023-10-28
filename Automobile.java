public class Automobile extends LandTransportation {
    public int horsepower;

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getHorsepower() {
        return this.horsepower;
    }

    public String toString() {
        return String.format(
                "Vehicle type: %s\nRental or ticket: %s\nPrice: %f\nSpots available %d\nSpeed: %f\nTerrain: %s\nLocation: %s\nPickup time: %s\nMinutes of travel time: %d\nWheel count: %d\nHorsepower: %d\n",
                this.getVehicleType(),
                this.getServiceType(),
                this.getPrice(),
                this.getPassengerSpace(),
                this.getSpeed(),
                this.getTerrain(),
                this.getLocation(),
                this.getPickupTime(),
                this.getTravelTimeMins(),
                this.getHorsepower()
        );
    }

    Automobile(double price, int passengerSpace, double speed, String location, String pickupTime, int travelTime) {
        this.setVehicleType("Automobile");
        this.setServiceType("Rental");
        this.setPrice(price);
        this.setPassengerSpace(passengerSpace);
        this.setSpeed(speed);
        this.setTerrain("Land");
        this.setLocation(location);
        this.setPickupTime(pickupTime);
        this.setTravelTimeMins(travelTime);
        this.setWheelCount(4);
        this.setHorsepower(100);
    }
}
