package U4_LOOPS;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tries = 0;
        int rand = (int)(Math.random()*10)+1;
        int guess = 0;
        while(guess != rand){
            System.out.println("Guess a number from 1-10: ");
            guess = input.nextInt();
            input.nextLine();
            tries++;
            if(guess > rand){
                System.out.println("Your guess was too high");
            }else if(guess < rand){
                System.out.println("Your guess was too high");
            }else{
                System.out.println("Congrats! you guessed "+rand+" in "+tries+" tries!");
            }
        }
    }
}
