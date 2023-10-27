public class Submarine extends WaterTransportation {
    public int nuclearWarheads;

    public void setNuclearWarheads(int nuclearWarheads) {
        this.nuclearWarheads = nuclearWarheads;
    }

    public int getNuclearWarheads() {
        return this.nuclearWarheads;
    }

    public String toString() {
        return String.format(
                "Vehicle type: %s\nRental or ticket: %s\nPrice: %f\nSpots available %d\nSpeed: %f\nTerrain: %s\nLocation: %s\nPickup time: %s\nMinutes of travel time: %d\nDepth: %d\nNuclear warheads: %d\n",
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
                this.getNuclearWarheads()
        );
    }
}
