package U6_ARRAYS.Lab;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {

        TriviaGame testGame = new TriviaGame();
        welcome(); //welcome statment

        Question[] totalQuestions = testGame.getQuestions();

        for (int i = 0; i < totalQuestions.length; i++){
            //get random number
            int rand = (int)(Math.random()* totalQuestions.length);

            if(i > 0){
                // repeats random number
                while (totalQuestions[rand].isQuestionUsed()){

                    rand = (int)(Math.random()* totalQuestions.length);

                }
            }
            Question q = totalQuestions[rand];
            q.setUsed(true);
            System.out.println(q);
            Scanner in = new Scanner(System.in);
            System.out.println("Enter your answer: ");
            String answer = in.nextLine();

            if(!answer.substring(0, 1).equalsIgnoreCase(q.getAnswer().substring(0, 1))){
                System.out.println("Sorry, that answer is incorrect.");
                System.out.println("The correct answer is: " + q.getAnswer());
                testGame.setStreak(0);
                System.out.println("GAME STATS");
                System.out.println("STREAK: " + testGame.getStreak());

            }else{
                System.out.println("Great Job! That's the correct answer");
                System.out.println(q.getValue() + "has been added to your score");
                System.out.println();
                testGame.setScore(testGame.getScore() + q.getValue());
                testGame.setStreak(testGame.getStreak() + 1);
                testGame.setCorrectNum(testGame.getCorrectNum() + 1);
                System.out.println("GAME STATS");
                System.out.println("STREAK: " + testGame.getStreak());
            }
            System.out.println("TOTAL POINTS: " + testGame.getScore());
            if(!playAgain() || i == testGame.getScore()) { //in case user doesn't want to play again
                System.out.println("GAME END STATS");
                System.out.println("CORRECT QUESTIONS: " + testGame.getCorrectNum());
                System.out.println("PERCENT CORRECT: " + ((double)testGame.getCorrectNum()/15) * 100+ "%");
                System.out.println("STREAK: " + testGame.getStreak());
                separateText();
                System.out.println();
                break;
            }
        }
        closingStatement();
        Scanner replay = new Scanner(System.in);
        System.out.println("Do you want to replay the game? (yes/no)");
        String replayResponse = replay.nextLine();
        if (replayResponse.equalsIgnoreCase("yes")){
            System.out.println();
            //to recall the main method again to replay game
            main(null);
        }

    }


    /**
     * void method to help break up text from lines to
     * make reading easier for user
     */
    public static void separateText(){
        for (int i =0; i < 53; i++){
            System.out.print("*");
        }
    }

    /**
     * this boolean method asks if you want to continue playing
     * the game after a question is answered
     * @return boolean of true or false depending on if the user
     * wants to play again
     */
    public static boolean playAgain(){
        Scanner in = new Scanner(System.in);
        System.out.println("Would you like to play again? (yes/no)");

        String response = in.nextLine();

        if(response.equalsIgnoreCase("yes")){
            System.out.print("Let the game go on!");
            System.out.println();
            return true;
        }
        return false;
    }

    /**
     * void method which is used after the game has ended to say goodbye
     * to the user and thank them for playing
     */
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
