package U4_LOOPS;

public class Notes4_5_CodeAnalysis {
    public static void main(String[] args) {
        // #1
        outputBreak("Challenge 1: Number Pyramid 1 to 5");
        for (int i = 6; i > 1; i--) {
            for (int k = 1; k < i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        //#2
        outputBreak("Challenge 2: Number Pyramid 5 to 1");
        for (int i = 5; i > 0; i--) {
            for (int k = 0; k < i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        //#3
        outputBreak("Challenge 3:");
        everyOtherLetterPyramid("FremdVikings");
        //#4
        // test


    }

    public static void outputBreak(String title) {
        System.out.println();
        System.out.println();
        System.out.println(title);
        System.out.println();
    }

    public static void everyOtherLetterPyramid(String str) {
        String origStr = str;
        System.out.println(origStr);

        for (int i = 0; i < origStr.length(); i += 2) {
            System.out.println(i);
        }
    }
}