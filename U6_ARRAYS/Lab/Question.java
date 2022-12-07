package U6_ARRAYS.Lab;

public class Question {
    private String question;
    private String answer;
    private String[] choices;
    private int value;

    public Question(String question, String answer, String[] choices, int value) {
        this.question = question;
        this.answer = answer;
        this.choices = choices;
        this.value = value;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String[] getChoices() {
        return choices;
    }

    public void setChoices(String[] choices) {
        this.choices = choices;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString
}
