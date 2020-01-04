/**
 * 
 */
package ca.bcit.comp1510.lab3;

import java.util.Random;

/**
 * Dice.
 * 
 * Demonstrates the use of various methods in the API for the Random class.
 *
 * @author Benedict Halim
 * @version 2019 v2.0
 */
public class Dice {
    
    /**
     * Drives the program.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
        final int fourSides = 4;
        final int sixSides = 6;
        final int eightSides = 8;
        final int tenSides = 10;
        final int twelveSides = 12;
        final int twentySides = 20;
        
        int fourSidedDice = randomNumberGenerator.nextInt(fourSides) + 1;
        int sixSidedDice = randomNumberGenerator.nextInt(sixSides) + 1;
        int eightSidedDice = randomNumberGenerator.nextInt(eightSides) + 1;
        int tenSidedDice = randomNumberGenerator.nextInt(tenSides) + 1;
        int twelveSidedDice = randomNumberGenerator.nextInt(twelveSides) + 1;
        int twentySidedDice = randomNumberGenerator.nextInt(twentySides) + 1;
        
        System.out.println("4 sided dice: " + fourSidedDice);
        System.out.println("6 sided dice: " + sixSidedDice);
        System.out.println("8 sided dice: " + eightSidedDice);
        System.out.println("10 sided dice: " + tenSidedDice);
        System.out.println("12 sided dice: " + twelveSidedDice);
        System.out.println("20 sided dice: " + twentySidedDice);
        
        System.out.println("The total roll (sum of the six dice) is: "
                + (fourSidedDice + sixSidedDice + eightSidedDice + tenSidedDice
                        + twelveSidedDice + twentySidedDice)
                + ".");
        
    }
    
}
