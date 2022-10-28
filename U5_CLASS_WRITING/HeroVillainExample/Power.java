package U5_CLASS_WRITING.HeroVillainExample;

public class Power {
    private String power;

    public double powerStrength;

    public String toString(){
        String output = "";


        output += "Name of the superpower: " + this.power + "\n";
        output += "Power Strength: " + this.powerStrength;
        return output;
    }

    /**
     * full constructor of power object
     * @param power name of superpower
     * @param powerStrength this is the strength of your power (1-10)
     */
    public Power(String power, double powerStrength) {
        this.power = power;
        this.powerStrength = powerStrength;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public double getPowerStrength() {
        return powerStrength;
    }

    public void setPowerStrength(double powerStrength) {
        this.powerStrength = powerStrength;
    }
}
