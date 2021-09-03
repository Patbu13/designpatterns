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
 * Searches list by iteratively cutting it in half until string is found or
 * entire list is searched
 */
public class BinarySearch implements SearchBehavior {

    /**
     * Method for checking whether the given list contains the given string
     * 
     * @param data list being searched through for the string
     * @param item string being searched for
     * @return boolean returning whether the list contains the given string
     */
    @Override
    public boolean contains(ArrayList<String> data, String item) {

        data.sort(String.CASE_INSENSITIVE_ORDER);
        int i = 0;
        int x = data.size() - 1;
        int temp = 0;

        while (i <= x) {
            int m = i + (x - i) / 2;

            temp = item.compareToIgnoreCase(data.get(m));

            // If name is in the middle of list
            if (temp == 0)
                return true;

            // If temp is positive, focus right half of list
            if (temp > 0)
                i = m + 1;

            // If temp is negative, focus left half of list
            else
                x = m - 1;
        }
        /**
         * https://www.geeksforgeeks.org/binary-search-a-string/
         */
        return false;
    }

}