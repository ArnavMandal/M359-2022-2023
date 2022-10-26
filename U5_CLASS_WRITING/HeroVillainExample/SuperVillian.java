package U5_CLASS_WRITING.HeroVillainExample;

public class SuperVillian {
    private String villianName;

    private Power superPower;

    public SuperVillian(String villianName, Power SuperPower){
        this.villianName = villianName;
        this.superPower = new Power(superPower.getPower(), superPower.getPowerStrength());
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
