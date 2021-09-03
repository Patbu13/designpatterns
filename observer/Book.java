package designpatterns.observer;

/**
 * Patrick Burroughs
 * Portia Plante 247 Section 002
 * Observer Design Pattern
*/

/**
 * Object used to give the title and author's full name of each best seller
 */
public class Book {

    private String title;
    private String authorFirstName;
    private String authorLastName;

    /**
     * Constructor for each book entering the best seller list
     * 
     * @param title           title of the book
     * @param authorFirstName first name of the book's author
     * @param authorLastName  last name of the book's author
     */
    public Book(String ttl, String authorFN, String authorLN) {
        this.title = ttl;
        this.authorFirstName = authorFN;
        this.authorLastName = authorLN;
    }

    /**
     * Getter to return the book's title
     * 
     * @return string to get the title of the book
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Getter to return the author's first name
     * 
     * @return string to get the author's first name
     */
    public String getAuthorFirstName() {
        return this.authorFirstName;
    }

    /**
     * Getter to return the author's last name
     * 
     * @return string to get the author's last name
     */
    public String getAuthorLastName() {
        return this.authorLastName;
    }

    /**
     * Combines the title, author's first, and author's last names to a single
     * string
     */
    public String toString() {
        return " - " + this.title + " by: " + this.authorFirstName + " " + this.authorLastName;
    }
}
