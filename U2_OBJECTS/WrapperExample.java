package U2_OBJECTS;

public class WrapperExample {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);

        // Create a wrapped integer
        Integer wrappedint = new Integer(6);
        System.out.println(wrappedint.intValue());


        // Create a wrapped integer USING AUTOBOXING

        Integer wrappedInt2 = 12;
        System.out.println(wrappedInt2);


        // Create a wrapped double
        Double wrappedDouble = 5.67;
        System.out.println(wrappedDouble);


        // Display the min and max value of Integer
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
