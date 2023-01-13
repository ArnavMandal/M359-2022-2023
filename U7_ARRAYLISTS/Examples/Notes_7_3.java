package U7_ARRAYLISTS.Examples;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Notes_7_3 {
    public static void main(String[] args) {

        /** Part I:  Using loops to accumulate a sum or count **/

        // Create an ArrayList of Integer values called vals
        ArrayList<Integer> vals = new ArrayList<Integer>();
        // Fill the ArrayList to have the following values
        // 2, 7, 4, 8, 1, 6, 3, 9
        vals.add(2);
        vals.add(7);
        vals.add(4);
        vals.add(8);
        vals.add(1);
        vals.add(6);
        vals.add(9);
        vals.add(6, 3);

        // Be sure to practice using all the ways learned to fill this array
        // add(obj), add(index, obj), create a new Integer, just adding a number


        // Verify your array has the correct values before continuing :)
        System.out.println(vals);
        // Call countEvens and print the result
        int evenCount = countEvens(vals);
        System.out.println("num evens: " + evenCount);
        // Call countEvensForEach and print the result
        int forEach = countEvensForEach(vals);
        System.out.println("num even: " + forEach);
        /** Part II:  Using loops to remove a value **/
        // Create two ArrayLists of Integer values called list1 and list2
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<>();


        // Use a for loop to fill both list1 and list2 with values 1-20
        for (int i = 1; i < 21; i++){
            list1.add(i);
            list2.add(i);
        }
        // Print list1 and list2 to verify they have the correct values
        System.out.println(list1);
        System.out.println(list2);

        // Call removeEvensForward on list1
        removeEvensForward(list1);
        System.out.println(list1);
        // print list1

        // Call removeEvensBackward on list2
        removeEvensBackward(list2);
        // print list2
        System.out.println(list2);

        // SO DOES THIS MEAN REMOVING ELEMENTS WORKS THE SAME REGARDLESS OF HOW YOU
        // TRAVERSE THE ARRAY (FORWARD OR BACKWARD)?
        // TALK TO YOUR NEIGHBOR!!!!

        //Call removeEvensForward on vals and discuss what you see

        // Did this method work as intended?  Why or why not?

    }

    /**
     * This method will count and return how many values in the ArrayList nums
     * are even.  Write this method with a traditional for loop
     * @param nums ArrayList of Integers
     * @return number of even values
     */
    public static int countEvens(ArrayList<Integer> nums) {
        int numEven = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0)
                numEven++;
        }
        return numEven;

    }

    /**
     * This method will count and return how many values in the ArrayList nums
     * are even.  Write this method with a for each loop
     * @param nums ArrayList of Integers
     * @return number of even values
     */
    public static int countEvensForEach(ArrayList<Integer> nums) {
        int even = 0;
        for (Integer num: nums){
            if (num % 2 == 0)
                even++;
        }
        return even;

    }

    /**
     * This method will remove all even Integer values in the ArrayList
     * The ArrayList will be traversed from beginning to end.
     * @param vals ArrayList to remove values from
     */
    public static void removeEvensForward(ArrayList<Integer> vals) {
        for (int i = 0; i < vals.size(); i++){
        if (vals.get(i) % 2 == 0) {
            vals.remove(i);
        }
    }

    }
    /**
     * This method will remove all even Integer values in the ArrayList
     * The ArrayList will be traversed from end to beginning
     * @param vals ArrayList to remove values from
     */
    public static void removeEvensBackward(ArrayList<Integer> vals) {
        for (int i = vals.size() - 1; i >= 0; i--){
            if (vals.get(i) % 2 == 0){
                vals.remove(i);
            }
        }
    }
}