package designpatterns.decorator;

import java.util.ArrayList;

/**
 * Patrick Burroughs
 * Portia Plante 247 Section 002
 * Decorator Design Pattern
*/

/**
 * General object for every new character
 */
public abstract class Character {

    protected ArrayList<String> sections;

    /**
     * Constructor for the array holding each line of the base potato head
     */
    public Character() {
        this.sections = new ArrayList<String>();
    }

    /**
     * Method for printing the character to the user
     */
    public void draw() {
        for (int i = 0; i < sections.size(); i++) {
            System.out.println(sections.get(i));
        }
    }
}
