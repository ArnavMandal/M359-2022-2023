package U5_CLASS_WRITING.HeroVillainExample;

public class MarvelMovieTester {
    public static void main(String[] args) {
        // create a superpower obj for super speed
        Power p1 = new Power("Super Speed", 10);
        Power p2 = new Power("Flight", 8);

        SuperHero SuperMan = new SuperHero("Clark Kent", p2);
        System.out.println(SuperMan);
        System.out.println();
        SuperVillian reverseFlash = new SuperVillian("Reverse Flash", p1);
        System.out.println(reverseFlash);

        reverseFlash.getSuperPower().setPowerStrength(6);

        System.out.println(SuperMan);
        System.out.println();
        System.out.println(reverseFlash);


        // Have these two battle
    }

    /**
     * Simulates a battle between hero & villain. Whoever has greater power strength wins.
     * if power level is equal, we flip a coin to see who wins
     * After the battle...
     *      1. Winner gains 10% of loser's power level
     *      2. Lose will lose between 5% - 35% of their own power strength
     * @param a
     * @param b
     */
    public static void battle(SuperHero a, SuperVillian b){
        double aLvl = a.getSuperPower().getPowerStrength();
        double bLvl = a.getSuperPower().getPowerStrength();
    if (aLvl > bLvl){
        System.out.println("Hero won!!");

        aLvl += .1 * bLvl;

        a.getSuperPower().setPowerStrength(aLvl);

        int lossPrct  = (int)(Math.random()*(35-5+1)) + 5;
        double newVillian = bLvl - (lossPrct/100.0)*bLvl;
        b.getSuperPower().setPowerStrength(newVillian);
    } else if (bLvl > aLvl){
        System.out.println("Villain won!!");
        bLvl += .1 * aLvl;

        b.getSuperPower().setPowerStrength(bLvl);

        int lossPrct  = (int)(Math.random()*(35-5+1)) + 5;
        double newHero = aLvl - (lossPrct/100.0)*aLvl;
        a.getSuperPower().setPowerStrength(newHero);
    }else{
        System.out.println("lolol");
    }
    }
}
