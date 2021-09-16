package designpatterns.factory;

/**
 * @author Patrick Burroughs Portia Plante 247 Section 002 Factory Design
 *         Pattern
 */

public class TinyHomePlan extends HousePlan {

    /**
     * Constructor for the tiny home house plan
     */
    public TinyHomePlan() {
        super(1, 5, 200);
    }

    /**
     * Sets the materials of the house plan to resemble those required to build a
     * tiny home
     */
    protected void setMaterials() {

    }

    /**
     * Sets the features of the house plan to resemble those of a tiny home
     */
    protected void setFeatures() {

    }

    /**
     * Returns a string listing the details of the tiny home plan
     */
    public String toString() {
        return "";
    }
}
