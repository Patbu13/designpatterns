
//package designpatterns.iterator;
import java.util.Iterator;

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
        this.flights = new Flight[2];
        this.size = 0;
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
        Flight newFlight = new Flight(flightNum, from, to, duration, transfers);

        if (size + 1 != flights.length) {
            flights[size] = newFlight;
        } else {
            this.flights = growArray(flights);
            flights[size] = newFlight;
        }
        size++;
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
    private Flight[] growArray(Flight[] oldFlights) {
        Flight[] flights = new Flight[(oldFlights.length) * 2];

        for (int i = 0; i < oldFlights.length; i++) {
            flights[i] = oldFlights[i];
        }

        return flights;
    }

    /**
     * Creates an iterator to iterate through the airline's array of flights
     * 
     * @return the newly created iterator for the airline's array of flights
     */
    public FlightIterator createIterator() {
        return new FlightIterator(flights);
    }
}
