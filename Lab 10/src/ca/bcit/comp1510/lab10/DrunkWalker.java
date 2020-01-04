/**
 * 
 */
package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/**
 * <p>
 * DrunkWalker.
 * 
 * A simulation of drunk walkers.
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */
public class DrunkWalker {
    
    /**
     * Runs a simulation of drunk walkers.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the boundary:");
        int boundary = scan.nextInt();
        System.out.println("Enter the amount of steps:");
        int maxSteps = scan.nextInt();
        System.out.println("Enter how many drunks you'd like to simulate:");
        int simulations = scan.nextInt();
        int fallCounter = 0;
        
        for (int i = 1; i <= simulations; i++) {
            RandomWalker drunkWalker = new RandomWalker(maxSteps, boundary);
            
            drunkWalker.walk();
            
            if (!drunkWalker.inBounds()) {
                fallCounter++;
            }
        }
        
        System.out.println("The total number of tests: " + simulations);
        System.out.println("The number of falls: " + fallCounter);
        scan.close();
        
    }
    
}