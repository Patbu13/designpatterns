/**
 * Patrick Burroughs
 * Portia Plante 247 Section 002
 * State Design Pattern
 */

 /**
  * Provides each difficulty level with basic functions for playing the game
  */
public interface State {
    
    /**
     * Returns a random number for the game to use in a question
     * @return random number, in a different range depending on the current level
     */
    public int getNum();

    /**
     * Returns a random operation for the game to use in a question
     * @return random operation, different operations available for each level
     */
    public String getOperation();

    /**
     * Levels the user up to the next difficulty
     */
    public void levelUp();

    /**
     * Levels the user down to a lower difficulty
     */
    public void levelDown();
}
