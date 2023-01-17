package U7_ARRAYLISTS.Examples;

public class Notes_7_3_TryCatch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        String str = "hello";

        try {
            // int x = 5 / 0;
            // System.out.println("Last num: " + nums[4]);
            System.out.println(str.substring(0, 77));
        } catch (StringIndexOutOfBoundsException e) {

            System.out.println("Invalid Index for String dude...");
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid index dude for Array dude...");
        } catch (ArithmeticException e){

            System.out.println("Can't divide by 0!!!");
        } catch (Exception e) {

            System.out.println("Something went wrong...!");
        }
    }
}