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
        this.setFeatures();
        this.setMaterials();
        this.toString();
    }

    /**
     * Sets the materials of the house plan to resemble those required to build a
     * contemporary
     */
    protected void setMaterials() {
        materials.add(" - Ceramics");
        materials.add(" - High-Strength Alloys");
        materials.add(" - Composites");
    }

    /**
     * Sets the features of the house plan to resemble those of a contemporary
     */
    protected void setFeatures() {
        features.add(" - Oversized Windows");
        features.add(" - Unconventional Roofs");
        features.add(" - Minimalism");
        features.add(" - Open Floor Plan");
    }

    /**
     * Returns a string listing the details of the contemporary plan
     */
    public String toString() {
        return "Contemporary Home\nSquare Feet: " + this.getSquareFeet() + "\nRoom: " + this.getNumRooms()
                + "\nWindows: " + this.getNumWindows() + "\n\nMaterials:\n" + materials.get(0) + "\n" + materials.get(1)
                + "\n" + materials.get(2) + "\n\nFeatures:\n" + features.get(0) + "\n" + features.get(1) + "\n"
                + features.get(2) + "\n" + features.get(3) + "\n";
    }
}
