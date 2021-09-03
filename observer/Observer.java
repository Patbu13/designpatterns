package designpatterns.observer;

/**
 * Patrick Burroughs
 * Portia Plante 247 Section 002
 * Observer Design Pattern
*/

/**
 * Interface to provide basic methods to observers of the children of interface
 * Subject
 */
public interface Observer {

    /**
     * Update the child's current list with a new book
     * 
     * @param book string of name and author of new best seller
     */
    public void update(Book book);

    /**
     * Display the child's current list to the user
     */
    public void display();
}
