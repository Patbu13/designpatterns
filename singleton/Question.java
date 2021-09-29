/**
 * @author Patrick Burroughs
 * Portia Plante 247 Section 002
 * Singleton Design Pattern
 */

/**
 * Deals with the handling of questions in the list and whether the user is
 * correct / related feedback
 */
public class Question {

    private String question;
    private String[] answers;
    private int correctAnswer;

    /**
     * Constructor for each question in the list of questions
     * 
     * @param question      string containing the question to be printed
     * @param ans1          answer 1
     * @param ans2          answer 2
     * @param ans3          answer 3
     * @param ans4          answer 4
     * @param correctAnswer the number of the correct answer
     */
    public Question(String quest, String ans1, String ans2, String ans3, String ans4, int correct) {
        question = quest;
        answers[0] = ans1;
        answers[1] = ans2;
        answers[2] = ans3;
        answers[3] = ans4;
        correctAnswer = correct;
        this.toString();
    }

    /**
     * Concatenates the information found/provided into a readable string to be
     * returned and printed to the user
     */
    public String toString() {
        return question + "\n 1. " + answers[0] + "\n 2. " + answers[1] + "\n 3. " + answers[2] + "\n 4. " + answers[3]
                + "\n";
    }

    /**
     * Checks if the user's answer is correct
     * 
     * @param userAnswer the number inputted by the user to answer
     * @return whether the user's answer was correct or not
     */
    public boolean isCorrect(int userAnswer) {
        if (userAnswer - 1 == correctAnswer) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retrieves the text of the correct answer
     * 
     * @return the text of the correct answer
     */
    public String getCorrectAnswer() {
        return answers[correctAnswer];
    }
}
