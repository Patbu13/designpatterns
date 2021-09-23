//package designpatterns.iterator;

/**
 * Patrick Burroughs
 * Portia Plante 247 Section 002
 * Iterator Design Pattern
*/

/**
 * Interface to provide FlightIterator with basic methods for iterating through
 * flights
 */
public interface Iterator {

    /**
     * Checks if there is another flight in the array
     * 
     * @return whether there is another flight in the array
     */
    public boolean hasNext();

    /**
     * Iterates to the next flight in the array
     * 
     * @return the next flight in the array
     */
    public Object next();
}
