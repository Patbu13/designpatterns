/**
 * Patrick Burroughs
 * Portia Plante 247 Section 002
 * State Design Pattern
 */

import java.util.Random;

/**
 * Handles the gameplay for users on easy difficulty
 */
public class Easy implements State {
    
    private ArithemeticGame game;
    private Random rand;

    /**
     * Constructor for an easy stage of the game
     * @param game the current game
     */
    public Easy(ArithemeticGame game) {
        rand = new Random();
        this.game = game;
    }

    /**
     * Returns a random number for the game to use in a question
     * @return random number, 1-10 for easy
     */
    public int getNum() {
        return (rand.nextInt(10) + 1);
    }

    /**
     * Returns a random operation for the game to use in a question
     * @return random operation, only + and - available for easy
     */
    public String getOperation() {
        int op = rand.nextInt(2);
        if (op == 0) {
            return "+";
        }
        else {
            return "-";
        }
    }

    /**
     * Levels the user up to the next difficulty
     */
    public void levelUp() {
        System.out.println("You've been advanced to medium mode.");
        game.setState(game.getMediumState());
    }

    /**
     * Makes fun of the user for being bad on easy mode
     */
    public void levelDown() {
        System.out.println("You seem to be struggling, you may want to study.");
    }
}
