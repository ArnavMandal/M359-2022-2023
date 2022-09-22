package UNIT1_PRIMITIVETYPES;

import java.sql.SQLOutput;

public class NOTES_1_4_1_5 {
    public static void main(String[] args) {
        // 1. Given a decimal number (double),
        // TRUNCATE the decimals and display the resulting whole number
        double width = 12.7391;
        int widthWhole = (int) width;  // This is known as casting.
        System.out.println(widthWhole);  // The whole number is displayed.

        // 2. Given an integer, display it TRUNCATED to the hundreds place
        int population = 8132789;               // should display 8132700
        double populationDec = population / 100 * 100;
        int populationWhole = (int) populationDec;
        System.out.println(populationWhole);
        // 3. Given a decimal number, display it ROUNDED to the nearest int.

        double height = 7.89;
        int rounded = (int)(height + 0.5);
        System.out.println(rounded);
        // 4. Given an int, display it ROUNDED to the nearest hundredth place.
        int speed = 16378;
        int java = 3 % 5;
        System.out.println(java);

    }
}
