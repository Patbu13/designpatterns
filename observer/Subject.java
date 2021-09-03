package designpatterns.observer;

/**
 * Patrick Burroughs
 * Portia Plante 247 Section 002
 * Observer Design Pattern
*/

/**
 * Interface holding methods to give associated classes the ability to edit the
 * active observers and notify them for certain events
 */
public interface Subject {

    /**
     * Add a new object of type observer
     * 
     * @param observer object that uses information from children of this interface
     *                 to update and provide information pertinent to itself
     */
    public void registerObserver(Observer observer);

    /**
     * Remove an existing object of type observer
     * 
     * @param observer object that uses information from children of this interface
     *                 to update and provide information pertinent to itself
     */
    public void removeObserver(Observer observer);

    /**
     * Updates observers when a new book has reached a child of this interface's
     * list
     * 
     * @param book string of name and author of new best seller
     */
    public void notifyObservers(Book book);
}
