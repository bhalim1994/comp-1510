/**
 * 
 */
package ca.bcit.comp1510.lab6;

/**
 * Name.
 * 
 * Demonstrates the use of a constructor, accessors, mutators, and helper
 * methods by creating a Name object.
 *
 * @author Benedict Halim
 * @version 2019 v3.1
 */
public class Name {
    
    // 2. Private instance variables
    /**
     * First name.
     */
    private String firstName;
    /**
     * Middle name.
     */
    private String middleName;
    /**
     * Last name.
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
        if (first.trim().length() != 0) {
            firstName = first.substring(0, 1).toUpperCase()
                    + first.substring(1).toLowerCase();
        } else {
            firstName = "FIRSTNAME";
        }
        
        if (middle.trim().length() != 0) {
            middleName = middle.substring(0, 1).toUpperCase()
                    + middle.substring(1).toLowerCase();
        } else {
            middleName = "MIDDLENAME";
        }
        
        if (last.trim().length() != 0) {
            lastName = last.substring(0, 1).toUpperCase()
                    + last.substring(1).toLowerCase();
        } else {
            lastName = "LASTNAME";
        }
    }
    
    // 4. Accessors
    
    /**
     * Gets the first name.
     * 
     * @return The first name.
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Gets the middle name.
     * 
     * @return The middle name.
     */
    public String getMiddleName() {
        return middleName;
    }
    
    /**
     * Gets the last name.
     * 
     * @return The last name.
     */
    public String getLastName() {
        return lastName;
    }
    
    // 4. Mutators
    /**
     * Sets the first name with the first character capitalized and the rest in
     * lower case.
     * 
     * @param first A string input for first name.
     */
    public void setFirstName(String first) {
        if (first.trim().length() != 0) {
            middleName = first.substring(0, 1).toUpperCase()
                    + first.substring(1).toLowerCase();
        }
    }
    
    /**
     * Sets the middle name with the first character capitalized and the rest in
     * lower case.
     * 
     * @param middle A string input for middle name.
     */
    public void setMiddleName(String middle) {
        if (middle.trim().length() != 0) {
            middleName = middle.substring(0, 1).toUpperCase()
                    + middle.substring(1).toLowerCase();
        }
    }
    
    /**
     * Sets the last name with the first character capitalized and the rest in
     * lower case.
     * 
     * @param last A string input for last name.
     */
    public void setLastName(String last) {
        if (last.trim().length() != 0) {
            lastName = last.substring(0, 1).toUpperCase()
                    + last.substring(1).toLowerCase();
        }
    }
    
    // 5. toString method
    
    /**
     * Returns the full name.
     * 
     * @return A concatenation of firstName, middleName, and lastName.
     */
    public String toString() {
        return firstName + " " + middleName + " " + lastName;
    }
    
    // 3. a.
    /**
     * Calculates the character length of inputed full name.
     * 
     * @return The sum of the character length of your first name, middle name,
     *         and last name.
     */
    public int sumNameLength() {
        return firstName.length() + middleName.length() + lastName.length();
    }
    
    // 3. b.
    /**
     * Upper-cases the initials of the full name.
     * 
     * @return The initials of the inputed full name in upper-case.
     */
    public String upperCaseInitials() {
        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        char lastInitial = lastName.charAt(0);
        String initials = String.valueOf(firstInitial) + "."
                + String.valueOf(middleInitial) + "."
                + String.valueOf(lastInitial);
        return initials.toUpperCase();
    }
    
    // 3. c.
    /**
     * Returns the nth character of the inputed full name.
     * 
     * @param n An integer.
     * @return the nth character.
     */
    public char getNthCharacter(int n) {
        if (n > toString().length()) {
            return '@';
        } else if (n <= firstName.length()) {
            return firstName.charAt(n - 1);
        } else if (n <= firstName.length() + middleName.length()) {
            return middleName.charAt(n - firstName.length() - 1);
        } else {
            return lastName.charAt(
                    (n - (firstName.length() + middleName.length()) - 1));
        }
//        return toString().charAt(n - 1);
    }
    
    // 3. d.
    /**
     * Returns the inputed full name as last-name, first-name middle-name.
     * 
     * @return The full name as last-name, first-name middle-name.
     */
    public String lastNameFirst() {
        return lastName + ", " + firstName + " " + middleName;
    }
    
    // 3. e.
    /**
     * Checks if the inputed string is equal to the first name.
     * 
     * @param str An inputed string.
     * @return Whether the inputed string is equal to the first name.
     */
    public boolean isFirstNameEqual(String str) {
        return firstName.equals(str);
    }
    
    // 3. f.
    /**
     * Checks if the inputed Name object is equal to the current Name.
     * 
     * @param name An inputed name.
     * @return Whether the inputed name is equal to the current name.
     */
    public boolean isFullNameEqual(Name name) {
        return this.firstName.equals(name.getFirstName())
                && this.middleName.equals(name.getMiddleName())
                && this.lastName.equals(name.getLastName());
    }
    
}
