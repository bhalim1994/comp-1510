/**
 * 
 */
package ca.bcit.comp1510.lab5;

/**
 * NameDriver.
 * 
 * Tests the Name class.
 *
 * @author Benedict Halim
 * @version 2.0
 */

public class NameDriver {
    
    /**
     * Drives the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        // Create Name object.
        Name myName = new Name("benedict", "nah", "halim");
        
        // Tests the name class methods.
        
        System.out.println(myName.sumNameLength());
        
        System.out.println(myName.upperCaseInitials());
        
        final int n = 12;
        System.out.println(myName.getNthCharacter(n));
        
        System.out.println(myName.lastNameFirst());
        
        System.out.println(myName.isFirstNameEqual("angelo"));
        
        System.out.println(myName.isFullNameEqual(myName));
    }
    
}
