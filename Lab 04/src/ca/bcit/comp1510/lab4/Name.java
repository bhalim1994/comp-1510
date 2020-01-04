/**
 * 
 */
package ca.bcit.comp1510.lab4;

/**
 * Name.
 * 
 * Demonstrates the use of a constructor, accessors, and mutators by creating a
 * Name object.
 *
 * @author Benedict Halim
 * @version 2019 v1.0
 */
public class Name {
    
    // 2. Private instance variables
    /**
     * firstName variable.
     */
    private String firstName;
    /**
     * middleName variable.
     */
    private String middleName;
    /**
     * lastName variable.
     */
    private String lastName;
    
    // 3. Constructor
    /**
     * Constructs a name object that has a first, middle and last name.
     * 
     * @param first  First name
     * @param middle Middle name
     * @param last   Last name
     */
    public Name(String first, String middle, String last) {
        firstName = first;
        middleName = middle;
        lastName = last;
    }
    
    // 4. Accessors
    
    /**
     * Returns the first name.
     * 
     * @return The first name.
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Returns the middle name.
     * 
     * @return The middle name.
     */
    public String getMiddleName() {
        return middleName;
    }
    
    /**
     * Returns the last name.
     * 
     * @return The last name.
     */
    public String getLastName() {
        return lastName;
    }
    
    // 4. Mutators
    /**
     * Sets the first name.
     * 
     * @param first A string input to first.
     */
    public void setFirstName(String first) {
        firstName = first;
    }
    
    /**
     * Sets the middle name.
     * 
     * @param middle A string input to middle.
     */
    public void setMiddleName(String middle) {
        middleName = middle;
    }
    
    /**
     * Sets the last name.
     * 
     * @param last A string input to last.
     */
    public void setLastName(String last) {
        lastName = last;
    }
    
    // 5. toString method
    
    /**
     * Returns the full name.
     * 
     * @return A concatenation of firstName, middleName and lastName.
     */
    public String toString() {
        return firstName + " " + middleName + " " + lastName;
    }
    
}
