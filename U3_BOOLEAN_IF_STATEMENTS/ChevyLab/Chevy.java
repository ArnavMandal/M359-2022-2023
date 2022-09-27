package U3_BOOLEAN_IF_STATEMENTS.ChevyLab;

public class Chevy {
    private int year;
    private int miles;
    private double fuelEfficiency;
    private double price;
    private double priceWithUpgrades;
    private double grandTotal;
    private String model;
    private String color;
    private boolean hasLuxPackage;
    private boolean has4WDPkg;
    private boolean hasSportsPackage;
    final double TAX_RATE = .122;

    // Constructors
    public Chevy(){
        this.year = 2021;
        this.miles = 0;
        this.fuelEfficiency = 35;
        this.price = 16000;
        this.model = "Trax";
        this.color = "White";
        this.hasLuxPackage = false;
        this.has4WDPkg = false;
        this.hasSportsPackage = false;



    }


    public Chevy(int year, int miles, double fuelEfficiency, double price, String model, String color, boolean hasLuxPackage, boolean has4WDPkg, boolean hasSportsPackage) {
        this.year = year;
        this.miles = miles;
        this.fuelEfficiency = fuelEfficiency;
        this.price = price;
        this.model = model;
        this.color = color;
        this.hasLuxPackage = hasLuxPackage;
        this.has4WDPkg = has4WDPkg;
        this.hasSportsPackage = hasSportsPackage;
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

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
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

    public boolean isHasLuxPackage() {
        return hasLuxPackage;
    }

    public void setHasLuxPackage(boolean hasLuxPackage) {
        this.hasLuxPackage = hasLuxPackage;
    }

    public boolean getHas4WDPkg() {
        return has4WDPkg;
    }

    public void setHas4WDPkg(boolean has4wdPackage) {
        this.has4WDPkg = has4wdPackage;
    }

    public boolean isHasSportsPackage() {
        return hasSportsPackage;
    }

    public void setHasSportsPackage(boolean hasSportsPackage) {
        this.hasSportsPackage = hasSportsPackage;
    }
}
