package q3;

import java.util.Scanner;

/**
 * <p>
 * 
 * MultiCylinder.
 * 
 * Tests the Cylinder class.
 * </p>
 *
 * @author Benedict Halim
 * @version 2.0
 */
public class MultiCylinder {
    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM.
     * </p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // First cylinder's original values
        final double originalFirstRadius = 1.0;
        final double originalFirstHeight = 2.0;
        // First cylinder declared and initialized
        Cylinder cylinder1 = new Cylinder(originalFirstRadius,
                originalFirstHeight);
        // Prints out first cylinder's values
        originalFirstCylinder(cylinder1);
        
        // First cylinder's updated values
        final double updatedFirstRadius = 3.0;
        final double updatedFirstHeight = 4.0;
        // Sets first cylinder's values to updated values
        setFirstCylinder(cylinder1, updatedFirstRadius, updatedFirstHeight);
        // Prints out first cylinder's updated values
        updatedFirstCylinder(cylinder1);
        
        // Second cylinder's original values
        final double originalSecondRadius = 5.0;
        final double originalSecondHeight = 5.5;
        // Second cylinder declared and initialized
        Cylinder cylinder2 = new Cylinder(originalSecondRadius,
                originalSecondHeight);
        // Prints out second cylinder's values
        originalSecondCylinder(cylinder2);
        
        // Declares and initializes a scanner object for user input
        Scanner scan = new Scanner(System.in);
        // Prints out second cylinder's updated values from user input
        updatedSecondCylinder(cylinder2, scan);
        
        // Close scanner object
        scan.close();
    }
    
    /**
     * <p>
     * Tests the toString, getter, surfaceArea, and volume methods of first
     * Cylinder object.
     * </p>
     *
     * @param c1 The first cylinder.
     */
    private static void originalFirstCylinder(Cylinder c1) {
        System.out.println(
                "Original First Cylinder (toString): " + c1.toString());
        System.out.println(
                "The original radius and height of the first cylinder is "
                        + c1.getRadius() + " and " + c1.getHeight()
                        + ", respectively.");
        System.out.println(
                "The original surface area and volume of your first cylinder"
                        + " are " + c1.surfaceArea() + " and " + c1.volume()
                        + ", respectively.");
    }
    
    /**
     * <p>
     * Sets the first cylinder's radius and height.
     * </p>
     * 
     * @param c1 The first cylinder.
     * @param r  The first cylinder's radius.
     * @param h  The first cylinder's height.
     */
    private static void setFirstCylinder(Cylinder c1, double r, double h) {
        c1.setRadius(r);
        c1.setHeight(h);
    }
    
    /**
     * <p>
     * Tests the toString, getter, surfaceArea, and volume methods of first
     * Cylinder object after mutation.
     * </p>
     *
     * @param c1 The first cylinder.
     */
    private static void updatedFirstCylinder(Cylinder c1) {
        System.out
                .println("Updated First Cylinder (toString): " + c1.toString());
        System.out.println(
                "The updated radius and height of the first cylinder is "
                        + c1.getRadius() + " and " + c1.getHeight()
                        + ", respectively.");
        System.out.println(
                "The updated surface area and volume of your first cylinder"
                        + " are " + c1.surfaceArea() + " and " + c1.volume()
                        + ", respectively.");
    }
    
    /**
     * <p>
     * Tests the toString, getter, surfaceArea, and volume methods of second
     * Cylinder object.
     * </p>
     *
     * @param c2 The second cylinder.
     */
    private static void originalSecondCylinder(Cylinder c2) {
        System.out.println(
                "Originl Second Cylinder (toString): " + c2.toString());
        System.out.println(
                "The original radius and height of the second cylinder is "
                        + c2.getRadius() + " and " + c2.getHeight()
                        + ", respectively.");
        System.out.println(
                "The original surface area and volume of your second cylinder"
                        + " are " + c2.surfaceArea() + " and " + c2.volume()
                        + ", respectively.");
    }
    
    /**
     * <p>
     * Tests the toString, getter, surfaceArea, and volume methods of second
     * Cylinder object after mutation from user input.
     * </p>
     *
     * @param c2 The second cylinder.
     * @param s  The scanner for user input.
     */
    private static void updatedSecondCylinder(Cylinder c2, Scanner s) {
        System.out.println(
                "Please enter a new radius for your second cylinder: ");
        c2.setRadius(s.nextDouble());
        System.out.println(
                "Please enter a new height for your second cylinder: ");
        c2.setHeight(s.nextDouble());
        System.out.println(
                "Updated Second Cylinder (toString): " + c2.toString());
        System.out.println(
                "The updated radius and height of the second cylinder is "
                        + c2.getRadius() + " and " + c2.getHeight()
                        + ", respectively.");
        System.out.println(
                "The updated surface area and volume of your second cylinder"
                        + " are " + c2.surfaceArea() + " and " + c2.volume()
                        + ", respectively.");
    }
};
