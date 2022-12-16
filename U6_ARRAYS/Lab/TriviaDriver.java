package U6_ARRAYS.Lab;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {

        TriviaGame testGame = new TriviaGame();
        welcome();

        Question[] totalQuestions = testGame.getQuestions();

        for (int i = 0; i < totalQuestions.length; i++){
            //get random number
            int rand = (int)(Math.random()* totalQuestions.length);

            if(i > 0){
                // repeats random number
                while (totalQuestions[rand] == totalQuestions[i]){
                rand = (int)(Math.random()* totalQuestions.length);
                }
            }
        }
    }




    public static void separateText(){
        for (int i =0; i < 53; i++){
            System.out.print("*");
        }
    }

    public static boolean playAgain(){
        Scanner in = new Scanner(System.in);
        System.out.println("Would you like to play again? (yes/no)");

        String response = in.nextLine();

        if(response.equalsIgnoreCase("yes")){
            System.out.print("Let the game go on!");
            return true;
        }
        return false;
    }

    public static void closingStatement(){
        System.out.println();
        System.out.println("Thanks for playing food trivia, hope you had fun!");
    }
    /**
     * this static method is meant to welcome the player
     * asks the name of player and if they want to start
     * the game, and reads out general instructions
     */
    public static void welcome(){
        separateText();
        //welcome statement
        System.out.println("");
        System.out.println("\n" + " Welcome to Food Trivia! ");
        separateText();
        //asking for username
        Scanner userName = new Scanner(System.in);

        System.out.print("\nWhat's your Username? ");

        String name = userName.nextLine();
        //greets player by name
        System.out.println("\n" + "Greetings " + name + ", Welcome to Food Trivia");
        //instructions
        System.out.println("\nInstructions: There are 15 Questions that you will need to answer.\n" +
                            "There are 4 choices but only 1 is correct. Your score is determined by" +
                            "the number of correct answers");
        Scanner userStart = new Scanner(System.in);
        //make user type start
        System.out.println("\nType /start/ to enter game.");

        String start = userStart.nextLine();

        while(!start.equalsIgnoreCase("start")){
            System.out.println("Error. Please type /Start/");
            userStart = new Scanner(System.in);
            start = userStart.nextLine();
        }

        separateText();

        System.out.println("");
    }
}
