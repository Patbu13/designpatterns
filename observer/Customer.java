package designpatterns.observer;

import java.util.ArrayList;

/**
 * Patrick Burroughs
 * Portia Plante 247 Section 002
 * Observer Design Pattern
*/

/**
 * Deals with modification and handling of the customer's wish list
 */
public class Customer implements Observer {

    private Subject subject;
    private String firstName;
    private String lastName;
    private ArrayList<Book> wishList;

    /**
     * Constructor for creation of the customer which holds methods and variables to
     * manage and display the customer's wish list
     * 
     * @param subject   subject of the customer's wish list
     * @param firstName the first name of the customer
     * @param lastName  the last name of the customer
     */
    public Customer(Subject sbj, String fN, String lN) {
        this.subject = sbj;
        this.firstName = fN;
        this.lastName = lN;
        this.wishList = new ArrayList<Book>();
        subject.registerObserver(this);
    }

    /**
     * Add the newest best seller to the customer's wish list
     * 
     * @param book string of name and author of new best seller
     */
    public void update(Book bk) {
        wishList.add(bk);
    }

    /**
     * Display the wish list of the customer
     */
    public void display() {
        System.out.println("Wish List: \n");

        for (int i = 0; i < wishList.size(); i++) {
            System.out.println(wishList.get(i));
        }
    }
}
