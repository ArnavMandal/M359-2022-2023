package U5_CLASS_WRITING.HeroVillainExample;

public class Power {
    private String power;

    public int powerStrength;

    public String toString(){
        String output = "";

        output += "Name of the superpower: " + this.power + "\n";
        output += "Power Strength: " + this.powerStrength;
        return output;
    }
    public Power(String power, int powerStrength) {
        this.power = power;
        this.powerStrength = powerStrength;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getPowerStrength() {
        return powerStrength;
    }

    public void setPowerStrength(int powerStrength) {
        this.powerStrength = powerStrength;
    }
}
