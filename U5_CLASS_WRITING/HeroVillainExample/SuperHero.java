package U5_CLASS_WRITING.HeroVillainExample;

public class SuperHero {
    private String heroName;

    private Power superPower;

    public SuperHero(String heroName, Power superPower){
        this.heroName = heroName;
        this.superPower = new Power(superPower.getPower(), superPower.getPowerStrength());
    }

    public String toString(){
        String output ="";
        output += "SuperHero name: " +this.heroName +"\n";
        output+= superPower.toString();
        return output;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public Power getSuperPower() {
        return superPower;
    }

    public void setSuperPower(Power superPower) {
        this.superPower = superPower;
    }



}
