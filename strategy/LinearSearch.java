package designpatterns.strategy;

import java.util.ArrayList;

/**
 * Patrick Burroughs
 * Portia Plante 247 Section 002
 * Strategy Design Pattern
*/

/**
 * One of two forms of searching the given list for the given string
 * 
 * Searches entire list one by one
 */
public class LinearSearch implements SearchBehavior {

    /**
     * Method for checking whether the given list contains the given string
     * 
     * @param data list being searched through for the string
     * @param item string being searched for
     * @return boolean returning whether the list contains the given string
     */
    @Override
    public boolean contains(ArrayList<String> data, String item) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).equalsIgnoreCase(item))
                return true;
        }
        return false;
    }

}