package U6_ARRAYS.Lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {
   private Question[] questions;

   private int streak;

   private int correctNum;

    private static int score;

    public TriviaGame() throws FileNotFoundException {

    this.score = 0;

    this.correctNum = 0;

    this.streak = 0;

    this.questions = initQuestion();
    }
    public Question[] initQuestion() throws FileNotFoundException{

        File myFile = new File("trivia.txt");
        Scanner fileIn = new Scanner(myFile);

        int numQuestions = fileIn.nextInt();

        fileIn.nextLine();

        Question[] list = new Question[numQuestions];

        for (int i = 0; i < list.length; i++){
           String name = fileIn.nextLine();

           String a = fileIn.nextLine();

           String b = fileIn.nextLine();

           String c = fileIn.nextLine();

           String d = fileIn.nextLine();

           String correctChoice = fileIn.nextLine();

           int questionVal = fileIn.nextInt();

           if(fileIn.hasNextLine())
               fileIn.nextLine();

           String[] allChoices = {a, b, c, d};

           Question newQuestion = new Question(name, correctChoice, allChoices, questionVal);

           list[i] = newQuestion;
        }
        return list;

    }

    public int getStreak() {
        return streak;
    }

    public void setStreak(int streak) {
        this.streak = streak;
    }

    public int getCorrectNum() {
        return correctNum;
    }

    public void setCorrectNum(int correctNum) {
        this.correctNum = correctNum;
    }

    public static int getScore() {
        return score;
    }

    public static void setScore(int score) {
        TriviaGame.score = score;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }
}
