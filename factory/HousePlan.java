package designpatterns.factory;

import java.util.ArrayList;

/**
 * @author Patrick Burroughs Portia Plante 247 Section 002 Factory Design
 *         Pattern
 */

public abstract class HousePlan {

    protected ArrayList<String> materials;
    protected ArrayList<String> features;
    private int numRooms;
    private int numWindows;
    private int squareFeet;

    public HousePlan(int numRooms, int numWindows, int squareFeet) {
        this.materials = new ArrayList<String>();
        this.features = new ArrayList<String>();
        this.numRooms = numRooms;
        this.numWindows = numWindows;
        this.squareFeet = squareFeet;
    }

    protected void setMaterials() {
        materials = this.materials;
    }

    protected void setFeatures() {

    }

    public ArrayList<String> getMaterials() {
        return this.materials;
    }

    public ArrayList<String> getFeatures() {
        return this.features;
    }

    public int getNumRooms() {
        return this.numRooms;
    }

    public int getNumWindows() {
        return this.numWindows;
    }

    public int getSquareFeet() {
        return this.squareFeet;
    }

    public String toString() {
        return "";
    }
}
