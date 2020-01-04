package q4;

import java.util.Scanner;

/**
 * <p>
 * Demonstrates the use of the multiplication operator and + operator as a
 * String concatenation tool by calculating the cube's volume and surface area
 * through it's length.
 * </p>
 *
 * @author Benedict Halim, Set 1B
 * @version 1.0
 */
public class Cube {
    /**
     * <p>
     * Drives the program.
     * </p>
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        // Number of sides on a cube.
        final int sides = 6;
        
        // Prompts, scans, and stores input.
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length of a cube's side in cm: ");
        int length = scan.nextInt();
        
        // Prints volume and surface area of the cube.
        System.out.println("The cube's volume is: " + (length * length * length)
                + " cm^3");
        System.out.println("The cube's surface area is: "
                + (length * length * sides) + " cm^2");
        
        // Close scan object.
        scan.close();
    }
    
};
