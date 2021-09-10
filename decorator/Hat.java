package designpatterns.decorator;

/**
 * Patrick Burroughs
 * Portia Plante 247 Section 002
 * Decorator Design Pattern
*/

/**
 * Deals with the addition of a hat to a character's face
 */
public class Hat extends CharacterDecorator {

    /**
     * Constructor for the hat of the potato head
     * 
     * @param chr character object specifying which face is being drawn
     */
    public Hat(Character chr) {
        super(chr);
        this.character = chr;
        this.customize();
    }

    /**
     * Method to modify the character's face based on the requested features
     */
    public void customize() {
        sections.set(0, "\n    ____");
        sections.set(1, " __|____|____");
    }

}