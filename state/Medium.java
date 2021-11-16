/**
 * Patrick Burroughs
 * Portia Plante 247 Section 002
 * State Design Pattern
 */

import java.util.Random;

 /**
 * Handles the gameplay for users on medium difficulty
 */
public class Medium implements State {
    
    private ArithemeticGame game;
    private Random rand;

    /**
     * Constructor for a medium stage of the game
     * @param game the current game
     */
    public Medium(ArithemeticGame game) {
        rand = new Random();
        this.game = game;
    }

    /**
     * Returns a random number for the game to use in a question
     * @return random number, 1-50 for medium
     */
    public int getNum() {
        return (rand.nextInt(50) + 1);
    }

    /**
     * Returns a random operation for the game to use in a question
     * @return random operation, +, -, and * available for medium
     */
    public String getOperation() {
        int op = rand.nextInt(3);
        if (op == 0) {
            return "+";
        }
        else if (op == 1) {
            return "-";
        }
        else {
            return "*";
        }
    }

    /**
     * Levels the user up to hard
     */
    public void levelUp() {
        System.out.println("You've been advanced to hard mode.");
        game.setState(game.getHardState());
    }

    /**
     * Levels down the user to easy
     */
    public void levelDown() {
        System.out.println("You are struggling, let's go to easy mode.");
        game.setState(game.getEasyState());
    }
}
