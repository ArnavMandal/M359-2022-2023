package U3_BOOLEAN_IF_STATEMENTS.ChevyLab;

public class Chevy {
    private int year;
    private int miles;
    private double mpg;
    private double price;
    private double priceWithUpgrades;
    private double grandTotal;
    private String model;
    private String color;
    private boolean hasLuxuryPkg;
    private boolean has4WDPkg;
    private boolean hasSportsPkg;

    final double TAX_RATE = .122;
    final String MAKE = "Chevrolet";

    // Constructors
    public Chevy(){
        this.year = 2021;
        this.miles = 0;
        this.mpg = 35;
        this.price = 16000;
        this.model = "Trax";
        this.color = "White";
        this.hasLuxuryPkg = false;
        this.has4WDPkg = false;
        this.hasSportsPkg = false;



    }


    public Chevy(int year, int miles, double mpg, double price, String model, String color, boolean hasLuxuryPkg, boolean has4WDPkg, boolean hasSportsPackage) {
        this.year = year;
        this.miles = miles;
        this.mpg = mpg;
        this.price = price;
        this.model = model;
        this.color = color;
        this.hasLuxuryPkg = hasLuxuryPkg;
        this.has4WDPkg = has4WDPkg;
        this.hasSportsPkg = hasSportsPackage;
    }

    public boolean equals(Chevy other){
        if(this.model.equals(other.model) && this.color.equals(other.color) && this.miles<200 && other.miles<200){
        return true;
        }else if(this.model.equals(other.model) && this.color.equals(other.color) && this.miles>=200 && other.miles>=200){
            return true;
        }else{
            return false;
        }
    }

    public int compareTo(Chevy other){
        if(this.miles > other.miles){
            return 1;
        }else if(this.miles == other.miles){
            return 0;
        }else{
            return -1;
        }
    }

    public String toString() {
        String output = "**************************************************\n" + this.year + " " + this.MAKE + " " + this.model + " (" +
                this.color + ")\n\t" + "BASE PRICE:\t\t\t$" + this.price + "\n\tMILES:\t\t\t\t" + this.miles + "\n\tFUEL EFFICIENCY:\t\t"
                + this.mpg + " mpg\n\t" + "PACKAGES: ";
        if (hasLuxuryPkg == true) {
        }
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public double getMpg() {
        return mpg;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.mpg = mpg;
    }

    public double getBasePrice() {
        return price;
    }

    public void setBasePrice(double price) {
        this.price = price;
    }

    public double getPriceWithUpgrades() {
        return priceWithUpgrades;
    }

    public void setPriceWithUpgrades(double priceWithUpgrades) {
        this.priceWithUpgrades = priceWithUpgrades;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getLuxuryPkg() {
        return hasLuxuryPkg;
    }

    public void setLuxuryPkg(boolean hasLuxuryPkg) {
        this.hasLuxuryPkg = hasLuxuryPkg;
    }

    public boolean get4WDPkg() {
        return has4WDPkg;
    }

    public void set4WDPkg(boolean has4wdPackage) {
        this.has4WDPkg = has4wdPackage;
    }

    public boolean getSportsPkg() {
        return hasSportsPkg;
    }

    public void setSportsPackage(boolean hasSportsPkg) {
        this.hasSportsPkg = hasSportsPkg;
    }
}
