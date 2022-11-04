package U5_CLASS_WRITING.Lab;

public class Area {
    private String areaName;
    private int numRides;
    private Ride ride1;
    private Ride ride2;


    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public int getNumRides() {
        return numRides;
    }

    public void setNumRides(int numRides) {
        this.numRides = numRides;
    }

    public Ride getRide1() {
        return ride1;
    }

    public void setRide1(Ride ride1) {
        this.ride1 = ride1;
    }

    public Ride getRide2() {
        return ride2;
    }

    public void setRide2(Ride ride2) {
        this.ride2 = ride2;
    }


    public Area(String areaName, int numRides, Ride ride1, Ride ride2) {
        this.areaName = areaName;
        this.numRides = numRides;
        this.ride1 = ride1;
        this.ride2 = ride2;
    }

}
