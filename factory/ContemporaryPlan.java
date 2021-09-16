package designpatterns.factory;

/**
 * @author Patrick Burroughs Portia Plante 247 Section 002 Factory Design
 *         Pattern
 */

public class ContemporaryPlan extends HousePlan {

    /**
     * Constructor for the contemporary house plan
     */
    public ContemporaryPlan() {
        super(5, 40, 3000);
    }

    /**
     * Sets the materials of the house plan to resemble those required to build a
     * contemporary
     */
    protected void setMaterials() {

    }

    /**
     * Sets the features of the house plan to resemble those of a contemporary
     */
    protected void setFeatures() {

    }

    /**
     * Returns a string listing the details of the contemporary plan
     */
    public String toString() {
        return "";
    }
}
