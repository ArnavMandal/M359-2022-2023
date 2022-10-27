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
    }
}
