/**
 * Patrick Burroughs
 * Portia Plante 247 Section 002
 * State Design Pattern
 */

import java.util.Random;

 /**
 * Handles the gameplay for users on hard difficulty
 */
public class Hard implements State {
    
    private ArithemeticGame game;
    private Random rand;

    /**
     * Constructor for a hard stage of the game
     * @param game the current game
     */
    public Hard(ArithemeticGame game) {
        rand = new Random();
        this.game = game;
    }

    /**
     * Returns a random number for the game to use in a question
     * @return random number, 1-100 for hard
     */
    public int getNum() {
        return (rand.nextInt(100) + 1);
    }

    /**
     * Returns a random operation for the game to use in a question
     * @return random operation, +, -, *, and / available for hard
     */
    public String getOperation() {
        int op = rand.nextInt(4);
        if (op == 0) {
            return "+";
        }
        else if (op == 1) {
            return "-";
        }
        else if (op == 2) {
            return "*";
        }
        else {
            return "/";
        }
    }

    /**
     * Congratulates the user on being too good
     */
    public void levelUp() {
        System.out.println("You are doing so well!!!");
    }

    /**
     * Levels down the user to medium
     */
    public void levelDown() {
        System.out.println("You are struggling, let's go to medium mode.");
        game.setState(game.getMediumState());
    }
}