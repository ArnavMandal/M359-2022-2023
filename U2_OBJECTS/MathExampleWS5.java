package U2_OBJECTS;

import java.util.Scanner;

public class MathExampleWS5 {

    /*
     *  Arnav Mandal
     *  Mr.Moon - Period 7
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1: ");
        int x1 = input.nextInt();

        System.out.println("Enter y1: ");
        int y1 = input.nextInt();

        System.out.println("Enter x2: ");
        int x2 = input.nextInt();

        System.out.println("Enter y2: ");

       // Distance

        int y2 = input.nextInt();
        double powX = Math.pow((x1 - x2), 2);
        double powY = Math.pow((y1 - y2), 2);
        double distance = Math.sqrt((powX + powY));
        System.out.println("The distance between ("+x1+", "+y1+ ") and ("+x2+", "+y2+") is "+distance);

        // Max and min random values

        System.out.println("Min value is: ");
        int minVal = input.nextInt();

        System.out.println("max value is: ");
        int maxVal = input.nextInt();

        int range = maxVal - minVal;
        int randomVal = (int)(Math.random()*(range+1))+minVal;
        System.out.println("The random integer between "+minVal+" and "+maxVal+ " is: "+randomVal);

        // find abs val of 2 numbers being subtracted
        System.out.println("value one is: ");
        int val1 = input.nextInt();

        System.out.println("value two is: ");
        int val2 = input.nextInt();
        int absVal = Math.abs(val1-val2);
        System.out.println(val1-val2);
        System.out.println(absVal);
    }
}
