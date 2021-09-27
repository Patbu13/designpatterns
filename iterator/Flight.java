
//package designpatterns.iterator;
import java.util.Iterator;

/**
 * Patrick Burroughs
 * Portia Plante 247 Section 002
 * Iterator Design Pattern
 */

/**
 * Deals with individual flight information and returning the output to be
 * printed
 */
public class Flight {

    private String flightNum;
    private String from;
    private String to;
    private int duration;
    private int transfers;

    /**
     * Constructor for the flight's details
     * 
     * @param flightNum flight number
     * @param from      where the flight is coming from
     * @param to        where the flight is goin
     * @param duration  duration of the flight in minutes
     * @param tranfers  how many transfers the flight has
     */
    public Flight(String flightNum, String from, String to, int duration, int tranfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = tranfers;
    }

    /**
     * @return where the flight is coming from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return where the flight is going
     */
    public String getTo() {
        return this.to;
    }

    /**
     * @return the duration of the flight in minutes
     */
    public int getDuration() {
        return this.duration;
    }

    /**
     * @return the number of transfers the flight has
     */
    public int getNumTransfers() {
        return this.transfers;
    }

    /**
     * Returns the flight information in the format it will be printed to the
     * console
     */
    public String toString() {
        int hours = 0;
        int minutes = this.duration;

        while (minutes > 60) {
            minutes -= 60;
            hours++;
        }

        String returnString = "Flight Number: " + this.flightNum + "\nFrom: " + this.from + "\nTo: " + this.to
                + "\nDuration: " + hours + " hours " + minutes + " minutes\n";
        if (this.transfers == 0) {
            returnString += "Direct Flight";
        } else if (this.transfers == 1) {
            returnString += "1 Transfer";
        } else {
            returnString += this.transfers + " Transfers";
        }
        return returnString;
    }
}
