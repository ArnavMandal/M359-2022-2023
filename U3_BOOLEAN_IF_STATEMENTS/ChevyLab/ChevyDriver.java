package U3_BOOLEAN_IF_STATEMENTS.ChevyLab;

public class ChevyDriver {
    public static void main(String[] args) {
        Chevy testToString = new Chevy();
        System.out.println(testToString);
        Chevy newTest = new Chevy(1963, 123500, 13.5, 61500, "Corvette (Classic)",
                "Fire Red", false, true, true);
        System.out.println(newTest);
    }
}
