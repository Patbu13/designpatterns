package designpatterns.factory;

/**
 * @author Patrick Burroughs
 * Portia Plante 247 Section 002
 * Factory Design Pattern
*/

/**
 * Creates each of the base house plans Accessed/used before the plan can be
 * specfied to a type of plan
 */
public class HousePlanFactory {

    /**
     * Used to create the base house plan and call the specification classes
     * 
     * @param type tells the method what class to call to specify the plan
     * @return returns the specified house plan to the driver
     */
    public HousePlan createHousePlan(String type) {
        return HousePlan;
    }

}
