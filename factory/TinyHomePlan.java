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
        this.setFeatures();
        this.setMaterials();
        this.toString();
    }

    /**
     * Sets the materials of the house plan to resemble those required to build a
     * tiny home
     */
    protected void setMaterials() {
        this.materials.add(" - Lumber");
        this.materials.add(" - Insulation");
        this.materials.add(" - Metal Roofing");
        this.materials.add(" - Hardware");
    }

    /**
     * Sets the features of the house plan to resemble those of a tiny home
     */
    protected void setFeatures() {
        this.features.add(" - Natural Light");
        this.features.add(" - Creative Storage");
        this.features.add(" - Multipurpose Areas");
        this.features.add(" - Multi-use Applications");
    }

    /**
     * Returns a string listing the details of the tiny home plan
     */
    public String toString() {
        return "Tiny House\nSquare Feet: " + this.getSquareFeet() + "\nRoom: " + this.getNumRooms() + "\nWindows: "
                + this.getNumWindows() + "\n\nMaterials:\n" + materials.get(0) + "\n" + materials.get(1) + "\n"
                + materials.get(2) + "\n" + materials.get(3) + "\n\nFeatures:\n" + features.get(0) + "\n"
                + features.get(1) + "\n" + features.get(2) + "\n" + features.get(3) + "\n";
    }
}
