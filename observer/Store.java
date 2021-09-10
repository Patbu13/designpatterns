package designpatterns.observer;

import java.util.Queue;
import java.util.LinkedList;

/**
 * Patrick Burroughs
 * Portia Plante 247 Section 002
 * Observer Design Pattern
*/

/**
 * Deals with modification and handling of the store's top 5 best seller list
 */
public class Store implements Observer {

    private Subject subject;
    private Queue<Book> bestSellers;

    /**
     * Constructor for creation of the store which holds methods and variables to
     * manage and display the top 5 best sellers
     * 
     * @param subject subject of the list
     */
    public Store(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
        bestSellers = new LinkedList<Book>();
    }

    /**
     * TO BUILD MY QUEUE https://www.geeksforgeeks.org/queue-interface-java/
     */

    /**
     * Update the list of top 5 best sellers with the newest best seller
     * 
     * @param book string of name and author of new best seller
     */
    public void update(Book bk) {
        if (bestSellers.size() < 5)
            bestSellers.add(bk);
        else {
            bestSellers.remove();
            bestSellers.add(bk);
        }
    }

    /**
     * Display the list of the current top 5 best sellers
     */
    public void display() {
        System.out.print("Top 5 Best Sellers:");

        for (Book item : bestSellers) {
            System.out.println(item);
        }
        /**
         * to iterate through my queue of objects
         * https://stackoverflow.com/a/34714003/16823201
         */
    }
}
