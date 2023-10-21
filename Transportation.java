public class Transportation {
    private String[] options;
    private boolean rental;
    private boolean ticketed;
    private double price;
    private int passengerSpace;
    private double speed;
    private String terrain;
    private String location;
    private String pickupTime;
    private int travelTimeMins;

    public void setRental(boolean rental) {
        this.rental = rental;
    }

    public void setTicketed(boolean ticketed) {
        this.ticketed = ticketed;
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

    public double getPrice() {
        return price;
    }

    public double getSpeed() {
        return speed;
    }

    public int getPassengerSpace() {
        return passengerSpace;
    }

    public int getTravelTimeMins() {
        return travelTimeMins;
    }

    public String getLocation() {
        return location;
    }

    public String getPickupTime() {
        return pickupTime;
    }

    public String getTerrain() {
        return terrain;
    }

    public String[] getOptions() {
        return options;
    }
}
