package designpatterns.factory;

/**
 * @author Patrick Burroughs Portia Plante 247 Section 002 Factory Design
 *         Pattern
 */

public class LogCabinPlan extends HousePlan {

    /**
     * Constructor for the log cabin house plan
     */
    public LogCabinPlan() {
        super(2, 10, 1800);
    }

    /**
     * Sets the materials of the house plan to resemble those required to build a
     * log cabin
     */
    protected void setMaterials() {

    }

    /**
     * Sets the features of the house plan to resemble those of a log cabin
     */
    protected void setFeatures() {

    }

    /**
     * Returns a string listing the details of the log cabin plan
     */
    public String toString() {
        return "";
    }
}
