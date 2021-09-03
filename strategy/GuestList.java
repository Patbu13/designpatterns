package designpatterns.strategy;

import java.util.ArrayList;

/**
 * Patrick Burroughs
 * Portia Plante 247 Section 002
 * Strategy Design Pattern
*/
/**
 * Deals with the modification and handling of the guest list
 */
public class GuestList {

    private String title;
    private ArrayList<String> people;
    private SearchBehavior searchBehavior;

    /**
     * Object for creation of the guest list
     * 
     * @param title The name of the list
     */
    public GuestList(String listName) {
        title = listName;
        people = new ArrayList<String>();
        searchBehavior = new LinearSearch();
    }

    /**
     * Method for adding names to the list
     * 
     * @param person The name to add to the list
     * @return boolean to know if the name was successfully added or not
     */
    public boolean add(String person) {
        if (searchBehavior.contains(people, person) == true) {
            return false;
        } else {
            people.add(person);
            return true;
        }
    }

    /**
     * Method for removing names from the list
     * 
     * @param person The name to remove from the list
     * @return boolean to know if the name was successfully removed or not
     */
    public boolean remove(String person) {
        if (searchBehavior.contains(people, person) == true) {
            for (int i = 0; i < people.size(); i++) {
                if (person == people.get(i)) {
                    people.remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Getter for the title of the list
     * 
     * @return the title of the list
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for which search behavior will be used, linear or binary
     * 
     * @param searchBehavior tells method which search style should be set active
     */
    public void setSearchBehavior(SearchBehavior sBehave) {
        searchBehavior = sBehave;
    }

    /**
     * Getter for the list
     * 
     * @return the list
     */
    public ArrayList<String> getList() {
        return this.people;
    }
}