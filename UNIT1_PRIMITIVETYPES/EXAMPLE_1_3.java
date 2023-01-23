package UNIT1_PRIMITIVETYPES;

import java.sql.SQLOutput;

public class EXAMPLE_1_3 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        //  You're throwing a pizza party! Create variables
        // for the # of guests, as well as the # of pizzas
        int guestCount = 5;
        int pizzaCount = 2;
        System.out.println("We have " + guestCount + " Guests and " + pizzaCount + " Pizzas!");

        // 2. But wait! 2 more guests just showed up, bringing 4 more pizzas
        // Update all variables appropriately, then display the new info

        guestCount += 2;
        pizzaCount += 4;
        System.out.println("Now we have " + guestCount + " Guests and " + pizzaCount + " Pizzas!");
        // 3. Switching Gears a bit... display the ones digit of a given integer
        int num = 12098;
        int onesDigit = num % 10;
        // Finds the ones digit for any given int

        System.out.println(onesDigit);

        //4. Display the second to last digit...
        int numTwo = 17862;
        int tensDigit = (numTwo % 100) / 10;          //Like 82/10
        System.out.println("The tens digit is: " + tensDigit);

        System.out.print("\tSmile\n");
        System.out.print("more\b");
        System.out.println("\n\'please\"");

    int numsNew = "Hello";





    }
}
