
package moddel;


public class QuizModel {
    private String question = "ما هو الطول الموجي للضوء المرئي؟";
    private String[] options = {"أ) أقل من 400 نانومتر", "ب) بين 400 و 700 نانومتر", "ج) أكثر من 700 نانومتر", "د) لا يوجد طول موجي"};
    private String correctAnswer = "B";
    private int score = 0;

    public boolean checkAnswer(String selected) {
        if (selected.equals(correctAnswer)) {
            score++;
            return true;
        }
        return false;
    }

    // Getters
    public String getQuestion() { return question; }
    public String[] getOptions() { return options; }
    public int getScore() { return score; }
    
}
