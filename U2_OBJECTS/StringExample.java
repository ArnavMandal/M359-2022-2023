package U2_OBJECTS;

public class StringExample {
    public static void main(String[] args) {
        String s1 = "Vacation";
        String s2 = "Sunshine cures all things";
// .toUpperCase() returns the same string'
        // but in all capital letters:VACATION
        System.out.println(s1.toUpperCase());
        // just prints out Vacation because the toUpperCase didn't
        // change the variable itself.
        System.out.println(s1);
    // index starts at 0
        System.out.println(s2.indexOf("u"));
        System.out.println(s2.indexOf("x"));
    // prints s1 from index 4 until the end
        System.out.println(s1.substring(4));
    // prints s1 starting from index 2 until index 4,
        // not index 5.
        System.out.println(s1.substring(2,5));


        System.out.println(s1.length());
        System.out.println(s2.length());
    // case sensitive
        boolean isEqual = s1.equals("VACATION");
        System.out.println(isEqual);

        String s3 = "bat";
        String s4 = "bird";
        String s5 = "Mickey";
        System.out.println(s3.compareTo(s4));
        System.out.println(s3.compareTo(s3));
        // Capital M comes before lowercase b
        System.out.println(s4.compareTo(s3));
    }
}
