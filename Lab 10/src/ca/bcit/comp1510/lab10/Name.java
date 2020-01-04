/**
 * 
 */
package ca.bcit.comp1510.lab10;

/**
 * <p>
 * Name.
 * 
 * Creates a Name object that has a first, middle, and last name.
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */
public class Name implements Comparable<Name> {
    /**
     * The first name
     */
    private final String first;
    /**
     * The middle name
     */
    private final String middle;
    /**
     * The last name
     */
    private final String last;
    
    /**
     * Constructs a Name object by defining its first, middle and last name.
     * 
     * @param f a String for the first name
     * @param m a String for the middle name
     * @param l a String for the last name
     */
    public Name(String f, String m, String l) {
        if (l.trim().equals("") || f.trim().equals("")) {
            throw new IllegalArgumentException(
                    "You need a first name and a last name.");
        }
        first = f;
        if (m == null) {
            middle = "";
        } else {
            middle = m;
        }
        last = l;
    }
    
    /**
     * Getter for first name.
     * 
     * @return the first name as a String
     */
    public String getFirst() {
        return first;
    }
    
    /**
     * Getter for middle name.
     * 
     * @return the middle name as a String
     */
    public String getMiddle() {
        return middle;
    }
    
    /**
     * Getter for last name.
     * 
     * @return the last name as a String
     */
    public String getLast() {
        return last;
    }
    
    /**
     * Compares to another Name object by last, middle and first name.
     * 
     * @return The result of the comparison as an integer. Larger if current
     *         field is greater lexicographically, smaller if lesser, 0 if same
     */
    @Override
    public int compareTo(Name anotherName) {
        if (!last.equals(anotherName.last)) {
            return last.compareTo(anotherName.last);
        } else if (!middle.equals(anotherName.middle)) {
            return middle.compareTo(anotherName.middle);
        } else if (!first.equals(anotherName.first)) {
            return first.compareTo(anotherName.first);
        } else {
            return 0;
        }
        
    }
    
    /**
     * Returns a String of the full name.
     * 
     * @return the full name as a String
     */
    public String toString() {
        if (middle.isBlank() || middle == null) {
            return first + " " + last;
        } else {
            return first + " " + middle + " " + last;
        }
    }
    
}