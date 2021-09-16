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
        materials.set(0, "Ceramics");
        materials.set(1, "High-Strength Alloys");
        materials.set(2, "Composites");
    }

    /**
     * Sets the features of the house plan to resemble those of a contemporary
     */
    protected void setFeatures() {
        features.set(0, "Oversized Windows");
        features.set(1, "Unconventional Roofs");
        features.set(2, "Minimalism");
        features.set(3, "Open Floor Plan");
    }

    /**
     * Returns a string listing the details of the contemporary plan
     */
    public String toString() {
        return "Contemporary Home\nSquare Feet: " + this.getSquareFeet() + "\nRoom: " + this.getNumRooms()
                + "\nWindows: " + this.getNumWindows() + "\n\nMaterials:\n" + materials.get(0) + "\n" + materials.get(1)
                + "\n" + materials.get(2) + "\n\nFeatures:\n" + features.get(0) + "\n" + features.get(1) + "\n"
                + features.get(2) + "\n" + features.get(3) + "\n\n";
    }
}
