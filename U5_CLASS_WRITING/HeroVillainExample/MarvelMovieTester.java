package U5_CLASS_WRITING.HeroVillainExample;

public class MarvelMovieTester {
    public static void main(String[] args) {
        // create a superpower obj for super speed
        Power p1 = new Power("Super Speed", 10);
        Power p2 = new Power("Flight", 8);

        SuperHero SuperMan = new SuperHero("Clark Kent", p2);
    }
}
