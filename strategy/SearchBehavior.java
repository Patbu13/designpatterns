package strategy;

import java.util.ArrayList;
/**
 * Patrick Burroughs
 * Portia Plante 247 Section 002
 * Strategy Design Pattern
*/

/**
 * Interface to give each child the ability to check
 * if the list contains a specific name
 */
public interface SearchBehavior {
 
    /**
     * Method for checking whether the given list contains the given string
     * 
     * @param data list being searched through for the string
     * @param item string being searched for
     * @return boolean returning whether the list contains the given string
     */ 
    public boolean contains(ArrayList<String> data, String item);

}