//package designpatterns.iterator;

/**
 * Patrick Burroughs
 * Portia Plante 247 Section 002
 * Iterator Design Pattern
 */

/**
 * Holds all the flights for each instance of an airline
 */
public class Airline {

    private String title;
    private Flight[] flights;
    private int size;

    /**
     * Constructor for the airline and its array of flights
     * 
     * @param title name of the airline
     */
    public Airline(String title) {
        this.title = title;
        // TODO this.flights = Flight[];
    }

    /**
     * Adds a new flight to the airline's array of flights
     * 
     * @param flightNum flight number
     * @param from      where the flight is coming from
     * @param to        where the flight is going to
     * @param duration  flight duration in minutes
     * @param transfers how many transfers the flight has
     */
    public void addFlight(String flightNum, String from, String to, int duration, int transfers) {

    }

    /**
     * @return title of the airline
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Returns an array with the same current flights but twice as many spaces for
     * new flights
     * 
     * @param flights array of all of an airline's flights
     * @return the array of the airline's flights after being doubled
     */
    private Flight[] growArray(Flight[] flights) {
        return flights;
    }

    /**
     * Creates an iterator to iterate through the airline's array of flights
     * 
     * @return the newly created iterator for the airline's array of flights
     */
    public FlightIterator createIterator() {
        // TODO
    }
}