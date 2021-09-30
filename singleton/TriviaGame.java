import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author Patrick Burroughs
 * Portia Plante 247 Section 002
 * Singleton Design Pattern
 */

/**
 * Class responsible for all aspects of the handling of the game once started by
 * the driver
 */
public class TriviaGame {

    private static TriviaGame triviaGame;
    private int score;
    private Random rand;
    private Scanner reader;
    private ArrayList<Question> questions;

    /**
     * Constructor for the trivia game, the score, and utilities for other methods
     */
    private TriviaGame() {
        score = 0;
        rand = new Random();
        reader = new Scanner(System.in);
        questions = new ArrayList<Question>(DataLoader.getTriviaQuestions());
    }

    /**
     * Gets the instance for this trivia game; "jumpstarts" the game
     * 
     * @return the active trivia game
     */
    public static TriviaGame getInstance() {
        return triviaGame = new TriviaGame();
    }

    /**
     * Where the gameplay actually happens, called to start and continue the game
     * until the user quits
     */
    public void play() {
        String read = "";
        boolean playing = true;
        boolean correctness = false;

        while (playing == true) {
            correctness = triviaGame.playRound();
            if (correctness == true) {
                score++;
            }

            read = "";
            while (!read.equals("P") && !read.equals("Q")) {
                System.out.println("(P)lay or (Q)uit: ");
                read = reader.next().toUpperCase();
                if (read.equals("P")) {

                } else if (read.equals("Q")) {
                    System.out.println("You won " + score + " games!\nGoodbye");
                    System.exit(0);
                } else {
                    System.out.println("Improper input, please try again\n");
                }
            }
        }
    }

    /**
     * Method called for each new round of the game, displaying a question and
     * handling answers
     * 
     * @return whether the user was correct or not
     */
    private boolean playRound() {
        int whichQuestion = rand.nextInt(9);
        System.out.println(questions.get(whichQuestion));
        System.out.println("Enter Answer: ");
        int userAnswer = reader.nextInt();

        if (questions.get(whichQuestion).isCorrect(userAnswer)) {
            System.out.println("YAY! You got it right!");
            return true;
        } else if (userAnswer == 1 || userAnswer == 2 || userAnswer == 3 || userAnswer == 4) {
            System.out.println(
                    "You got it wrong!\nThe correct answer is " + questions.get(whichQuestion).getCorrectAnswer());
            return false;
        } else {
            System.out.println("Invalid input, so you're WRONG!");
            return false;
        }
    }
}
