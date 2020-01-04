/**
 * 
 */
package ca.bcit.comp1510.lab6;

/**
 * NameDriver.
 * 
 * Tests the Name class.
 *
 * @author Benedict Halim
 * @version 2019 v3.0
 */

public class NameDriver {
    
    // Creates some Name objects.
    private static Name myName = new Name("Benedict", "wow", "Halim");
    private static Name noFirstName = new Name("      ", "midDlE", "hAlIM");
    private static Name noMiddleName = new Name("beNedICT", " ", "hALim");
    private static Name noLastName = new Name("benedict", "mIdDle", "");
    
    /**
     * Drives the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        
        // Tests the constructors in the Name class.
        nameConstructorTest();
        
        // Tests the setters in the Name class.
        nameSetterTest();
        
        // Tests the getNthCharacter method in the Name class.
        getNthCharTest();
        
    }
    
    /**
     * Tests the constructors in the Name class.
     *
     */
    public static void nameConstructorTest() {
        System.out.println(myName);
        System.out.println(noFirstName);
        System.out.println(noMiddleName);
        System.out.println(noLastName);
    }
    
    /**
     * Tests the setters in the Name class.
     *
     */
    public static void nameSetterTest() {
        System.out.println("Original name: " + myName);
        myName.setFirstName("     ");
        myName.setMiddleName("");
        myName.setLastName("Lim");
        System.out.println("New name: " + myName);
    }
    
    /**
     * Tests the getNthCharacter method in the Name class.
     *
     */
    public static void getNthCharTest() {
        final int n1 = 9;
        System.out.println("1st nth character: " + n1);
        System.out.println(
                "getNthCharacter returns: " + myName.getNthCharacter(n1));
        
        final int n2 = 99;
        System.out.println("2nd nth character: " + n2);
        System.out.println(
                "getNthCharacter returns: " + myName.getNthCharacter(n2));
    }
}
