package U4_LOOPS;
import java.util.Scanner;
public class U4_1_NOTES {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isDone = false;
        int num = 0;
        int total = 0;
        int numScores = 0;
        while(isDone == false){
        // prompt user if we have new number
            System.out.println("Do you have a number to enter? (Y or N) ");
            String reply = input.nextLine();
            if(reply.equalsIgnoreCase("Y")){
                System.out.println("what is your number?");
                num = input.nextInt();
                total += num;
                numScores++;
            }else{
                isDone = true;
            }
        }
    }
}
