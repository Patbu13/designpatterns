//package designpatterns.iterator;

/**
 * Patrick Burroughs
 * Portia Plante 247 Section 002
 * Iterator Design Pattern
 */

/**
 * Deals with iterating through the airline's array of flights Uses some of the
 * methods passed from the iterator interface
 */
public class FlightIterator {

    private Flight[] flights;
    private int position;

    /**
     * Constructor for the ability to iterate through an array of flights
     * 
     * @param flights array of all the flights
     */
    public FlightIterator(Flight[] flights) {
        this.flights = flights;
        this.position = 0;
    }

    /**
     * Finds if there is another flight in the array
     * 
     * @return whether or not there is another flight in the array
     */
    public boolean hasNext() {
        return false;
    }

    /**
     * Iterates to the next flight in the array
     * 
     * @return the next flight in the array
     */
    public Flight next() {
        return this.flights[position];
        // ????? idk this a guess
    }
}
