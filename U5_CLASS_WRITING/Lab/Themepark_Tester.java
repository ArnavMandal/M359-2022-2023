package U5_CLASS_WRITING.Lab;

public class Themepark_Tester {

    public static void main(String[] args) {

        //ALL 6 RIDES
        Ride ragingBull = new Ride("Raging Bull", true, 62, 4.5);
        Ride giantDrop = new Ride("Giant Drop", false, 69, 4);
        Ride goliath = new Ride("Goliath", false, 50, 3.5);
        Ride americanEagle = new Ride("American Eagle", true, 39, 2);
        Ride batman = new Ride("Batman", false, 63, 3.5);
        Ride flash = new Ride("Flash", false, 45, 3);

        //ALL 3 AREAS
        Area southwestTerritory = new Area("Southwest Territory", 2, ragingBull, giantDrop);
        Area countyFair = new Area("County Fair", 2, goliath, americanEagle);
        Area yankeeHarbor = new Area("Yankee Harbor", 2, batman, flash);

        //THEME PARK
        Theme_Park sixFlags = new Theme_Park("Six Flags", southwestTerritory, countyFair, yankeeHarbor);

        System.out.println(ragingBull);
        //new new
    }


}
