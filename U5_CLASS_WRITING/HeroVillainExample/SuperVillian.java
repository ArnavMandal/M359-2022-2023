package U5_CLASS_WRITING.HeroVillainExample;

public class SuperVillian {
    private String villianName;

    private Power superPower;

    public SuperVillian(String villianName, Power superPower){
        this.villianName = villianName;
        this.superPower = new Power(superPower.getPower(), superPower.getPowerStrength());
    }
    public String toString(){
        String output ="";
        output += "SuperVillian name: " +this.villianName +"\n";
        output += superPower.toString();
        return output;
    }

    public String getVillianName() {
        return villianName;
    }

    public void setHeroName(String villianName) {
        this.villianName = villianName;
    }

    public Power getSuperPower() {
        return superPower;
    }

    public void setSuperPower(Power superPower) {
        this.superPower = superPower;
    }
}
