package U6_ARRAYS.Lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {
    Question[] questions;
    int streak;
    File myFile = new File("trivia.txt");
    Scanner fileIn = new Scanner(myFile);

    public void initQuestion() throws FileNotFoundException {
        int numQuestions = fileIn.nextInt();
        fileIn.nextLine();
        questions = Question[numQuestions];
        for (int i = 0; i < questions.length; i++){
            questions[i] = new Question(questions[i].getQuestion(), questions[i].getAnswer(),
                                        questions[i].getChoices(), questions[i].getValue());
        }


    }
}
