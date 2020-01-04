package q1;

import java.util.Random;

/**
 * <p>
 * PhoneNumbers.
 * 
 * Creates random phone numbers with some limitations in the form of
 * XXX-XXX-XXXX.
 * </p>
 *
 * @author Benedict Halim
 * @version 2.0
 */
public class PhoneNumbers {
    
    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM.
     * </p>
     *
     * @param args command line arguments.
     */
    
    public static void main(String[] args) {
        // Creates a random object to randomize phone number
        Random randomGenerator = new Random();
        
        // Prints out complete phone number
        System.out.println(firstSet(randomGenerator) + "-"
                + secondSet(randomGenerator) + "-" + thirdSet(randomGenerator));
    }
    
    /**
     * <p>
     * Calculates the first 3 digits of a phone number where none of them can be
     * 8 or 9.
     * </p>
     *
     * @param rg A random number generator
     * @return The first 3 digits of a phone number
     */
    private static String firstSet(Random rg) {
        final int firstIndividualLimit = 8;
        
        return ("" + rg.nextInt(firstIndividualLimit)
                + rg.nextInt(firstIndividualLimit)
                + rg.nextInt(firstIndividualLimit));
    }
    
    /**
     * <p>
     * Calculates the second 3 digits of a phone number where they cannot be
     * over 635, combined.
     * </p>
     *
     * @param rg A random number generator
     * @return The second 3 digits of a phone number
     */
    private static String secondSet(Random rg) {
        final int secondFirstLimit = 7;
        final int secondSecondLimit = 4;
        final int secondThirdLimit = 6;
        
        return ("" + rg.nextInt(secondFirstLimit)
                + rg.nextInt(secondSecondLimit) + rg.nextInt(secondThirdLimit));
    }
    
    /**
     * <p>
     * Calculates the last 4 digits of a phone number.
     * </p>
     *
     * @param rg A random number generator
     * @return The third 4 digits of a phone number
     */
    private static String thirdSet(Random rg) {
        final int thirdIndividualLimit = 10;
        
        return ("" + rg.nextInt(thirdIndividualLimit)
                + rg.nextInt(thirdIndividualLimit)
                + rg.nextInt(thirdIndividualLimit)
                + rg.nextInt(thirdIndividualLimit));
    }
}
