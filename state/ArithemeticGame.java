/**
 * @author Patrick Burroughs
 * Portia Plante 247 Section 002
 * State Design Pattern
 */

import java.util.Scanner;
import java.util.Random;

 /**
  * Handles the overall gameplay and manipulates other classes
  */
public class ArithemeticGame {
    
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;
    private Scanner reader;
    private int num1;
    private int num2;
    private String operator;
    private int userAnswer;
    private int rightAnswer;

    /**
     * Constructs the game variables and the scanner for user input
     */
    public ArithemeticGame() {
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        state = easyState;
        score = 0;
        reader = new Scanner(System.in);
    }

    /**
     * Handles interaction with the user and processes input, deciding what to do next
     */
    public void pressQuestionButton() {
        num1 = state.getNum();
        num2 = state.getNum();
        operator = state.getOperation();

        System.out.print(num1 + " " + operator + " " + num2 + ": ");
        userAnswer = reader.nextInt();
        if (operator.equals("+")) {
            rightAnswer = num1+num2;
        }
        else if (operator.equals("-")) {
            rightAnswer = num1-num2;
        }
        else if (operator.equals("*")) {
            rightAnswer = num1*num2;
        }
        else {
            rightAnswer = num1/num2;
        }

        if (userAnswer == rightAnswer) {
            System.out.println("Correct");
            score++;
            if (score >= 3) {
                score = 0;
                state.levelUp();
            }
        }
        else {
            System.out.println("Incorrect");
            score--;
            if (score <= -3) {
                score = 0;
                state.levelDown();
            }
        }
    }

    /**
     * Changes the state according to what it needs to be
     * @param state new state of the game
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * @return the easy state
     */
    public State getEasyState() {
        return easyState;
    }

    /**
     * @return the medium state
     */
    public State getMediumState() {
        return mediumState;
    }

    /**
     * @return the hard state
     */
    public State getHardState() {
        return hardState;
    }
}
