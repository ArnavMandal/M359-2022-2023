package U5_CLASS_WRITING.Lab;

public class Ride {
    private String name = "";
    private boolean isChildAllowed;
    private int heightOfDrop;
    private double rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isChildAllowed() {
        return isChildAllowed;
    }

    public void setChildAllowed(boolean childAllowed) {
        isChildAllowed = childAllowed;
    }

    public int getHeightOfDrop() {
        return heightOfDrop;
    }

    public void setHeightOfDrop(int heightOfDrop) {
        this.heightOfDrop = heightOfDrop;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    /**
     * Constructs a ride object with certain parameters
     * @param name
     * The rides name
     * @param isChildAllowed
     * Restriction on children attendance
     * @param heightOfDrop
     * Height in meters of the tallest point in the ride/coaster
     * @param rating
     * Average rating out of 5 from previous riders
     */
    public Ride(String name, boolean isChildAllowed, int heightOfDrop, double rating) {
        this.name = name;
        this.isChildAllowed = isChildAllowed;
        this.heightOfDrop = heightOfDrop;
        this.rating = rating;
    }

    /**
     * Displays a rides name, height of drop, rating, and children restrictions
     * @return Returns an organized string of rides attributes
     */
    public String toString(){
        String out = "";
        out += "Name of ride: " + this.name + "\nDrop Height (m): " + this.heightOfDrop;
        out += "\nRating out of 5: " + this.rating + "\nAre children allowed: "+ this.isChildAllowed;
        return out;
    }
}
