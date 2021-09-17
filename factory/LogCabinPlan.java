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
        this.setFeatures();
        this.setMaterials();
        this.toString();
    }

    /**
     * Sets the materials of the house plan to resemble those required to build a
     * log cabin
     */
    protected void setMaterials() {
        this.materials.add(" - Log Siding");
        this.materials.add(" - Board and Batten Siding");
        this.materials.add(" - White Pine");
    }

    /**
     * Sets the features of the house plan to resemble those of a log cabin
     */
    protected void setFeatures() {

        this.features.add(" - Timbered Roof");
        this.features.add(" - High Insulation");
        this.features.add(" - Rustic Effect");
    }

    /**
     * Returns a string listing the details of the log cabin plan
     */
    public String toString() {
        return "Log Cabin\nSquare Feet: " + this.getSquareFeet() + "\nRoom: " + this.getNumRooms() + "\nWindows: "
                + this.getNumWindows() + "\n\nMaterials:\n" + materials.get(0) + "\n" + materials.get(1) + "\n"
                + materials.get(2) + "\n\nFeatures:\n" + features.get(0) + "\n" + features.get(1) + "\n"
                + features.get(2) + "\n";
    }
}
