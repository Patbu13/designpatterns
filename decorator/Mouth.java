package designpatterns.decorator;

/**
 * Patrick Burroughs
 * Portia Plante 247 Section 002
 * Decorator Design Pattern
*/

/**
 * Deals with the addition of a mouth to a character's face
 */
public class Mouth extends CharacterDecorator {

    /**
     * Constructor for the mouth of the potato head
     * 
     * @param chr character object specifying which face is being drawn
     */
    public Mouth(Character chr) {
        super(chr);
        this.character = chr;
        this.customize();
    }

    /**
     * Method to modify the character's face based on the requested features
     */
    public void customize() {
        sections.set(5, "  \\ ---- / ");
    }

}
