package designpatterns.decorator;

/**
 * Patrick Burroughs
 * Portia Plante 247 Section 002
 * Decorator Design Pattern
*/

/**
 * "General Manager" for dealing with the specific editing of a character's face
 */
public class CharacterDecorator {

    protected Character character;

    /**
     * Constructor for the specific character being modified
     * 
     * @param chr character object specifying which face is being drawn
     */
    public CharacterDecorator(Character chr) {

        this.character = chr;

    }

    /**
     * Method for calling the requested facial customization methods
     */
    public void customize() {

    }

}
