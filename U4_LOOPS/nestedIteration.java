package U4_LOOPS;

public class nestedIteration {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--){
            for(int k = 0; k < i; k++){
                System.out.print(k+" ");
            }
            System.out.println(" ");
        }
    }
}
