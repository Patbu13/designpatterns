package designpatterns.observer;

import java.util.ArrayList;

/**
 * Patrick Burroughs
 * Portia Plante 247 Section 002
 * Observer Design Pattern
*/

/**
 * Deals with the modification and handling of the best sellers list
 */
public class BestSellers implements Subject {

    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;

    /**
     * Object for creation of the best sellers list
     */
    public BestSellers() {
        observers = new ArrayList<Observer>();
        bestSellers = new ArrayList<Book>();
    }

    /**
     * Add a new object of type observer to the observer list
     * 
     * @param observer object that uses information from the best seller list to
     *                 update and provide information pertinent to itself
     */
    public void registerObserver(Observer obs) {
        observers.add(obs);
    }

    /**
     * Remove an existing object of type observer from the observer list
     * 
     * @param observer object that uses information from the best seller list to
     *                 update and provide information pertinent to itself
     */
    public void removeObserver(Observer obs) {
        observers.remove(obs);
    }

    /**
     * Update observers when a new book has been added to the best seller list
     * 
     * @param book string of name and author of new best seller
     */
    public void notifyObservers(Book bk) {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(bk);
        }
    }

    /**
     * Add a new book to the best seller list
     * 
     * @param book string of name and author of new best seller
     */
    public void addBook(Book bk) {
        bestSellers.add(bk);
    }
}
