public class Transportation {
    private String[] options;
    private String serviceType;
    private double price;
    private int passengerSpace;
    private double speed;
    private String terrain;
    private String location;
    private String pickupTime;
    private int travelTimeMins;

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

    public double getPrice() {
        return price;
    }

    public String getServiceType() {
        return serviceType;
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
