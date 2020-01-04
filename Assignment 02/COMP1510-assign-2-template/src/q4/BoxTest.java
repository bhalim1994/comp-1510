package q4;

import java.util.Scanner;

/**
 * <p>
 * BoxTest.
 * 
 * Tests the Box class.
 * </p>
 *
 * @author Benedict Halim
 * @version 2.0
 */
public class BoxTest {
    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM.
     * </p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // First box's original values
        final double originalFirstHeight = 2.0;
        final double originalFirstWidth = 2.0;
        final double originalFirstDepth = 3.0;
        // First box declared and initialized
        Box box1 = new Box(originalFirstHeight, originalFirstWidth,
                originalFirstDepth);
        // Prints out first box's original values
        originalFirstBox(box1);
        
        // First box's updated values
        final double updatedFirstHeight = 6.1;
        final double updatedFirstWidth = 2.8;
        final double updatedFirstDepth = 3.9;
        // Sets first box's values to updated values
        setFirstBox(box1, updatedFirstHeight, updatedFirstWidth,
                updatedFirstDepth);
        // Prints out first box's updated values
        updatedFirstBox(box1);
        
        // Second box's original values
        final double secondHeight = 5.0;
        final double secondWidth = 10.0;
        final double secondDepth = 15.0;
        // Second box declared and initialized
        Box box2 = new Box(secondHeight, secondWidth, secondDepth);
        // Prints out second box's original values
        originalSecondBox(box2);
        
        // Declares and initializes scanner object for user input
        Scanner scan = new Scanner(System.in);
        // Prints out second box's updated values from user input
        updatedSecondBox(box2, scan);
        // Close scanner object
        scan.close();
    }
    
    /**
     * <p>
     * Tests the toString and getter methods of first Box object.
     * </p>
     *
     * @param b1 The first box.
     */
    private static void originalFirstBox(Box b1) {
        System.out.println("Original First Box (toString): " + b1.toString());
        System.out.println(
                "The original height, width, depth of the first box is "
                        + b1.getHeight() + ", " + b1.getWidth() + ", and "
                        + b1.getDepth() + ", respectively. It is "
                        + b1.getFull()
                        + " that the original first box is full.");
    }
    
    /**
     * <p>
     * Sets the first box's height, width, depth, and whether it's full.
     * </p>
     * 
     * @param b1 The first box.
     * @param h  The first box's height.
     * @param w  The first box's width.
     * @param d  The first box's depth.
     */
    private static void setFirstBox(Box b1, double h, double w, double d) {
        b1.setHeight(h);
        b1.setWidth(w);
        b1.setDepth(d);
        b1.setFull(true);
    }
    
    /**
     * <p>
     * Tests the toString and getter methods of the first Box object after
     * mutation.
     * </p>
     *
     * @param b1 The first box.
     */
    private static void updatedFirstBox(Box b1) {
        System.out.println("Updated First Box (toString): " + b1.toString());
        System.out
                .println("The updated height, width, depth of the first box is "
                        + b1.getHeight() + ", " + b1.getWidth() + ", and "
                        + b1.getDepth() + ", respectively. It is "
                        + b1.getFull()
                        + " that the updated first box is full.");
    }
    
    /**
     * <p>
     * Tests the toString and getter methods of second Box object.
     * </p>
     *
     * @param b2 The second box.
     */
    private static void originalSecondBox(Box b2) {
        System.out.println("Original Second Box (toString): " + b2.toString());
        System.out.println(
                "The original height, width, depth of the second box is "
                        + b2.getHeight() + ", " + b2.getWidth() + ", and "
                        + b2.getDepth() + ", respectively. It is "
                        + b2.getFull()
                        + " that the original second box is full.");
    }
    
    /**
     * <p>
     * Tests the toString and getter methods of second Box object after mutation
     * from user input.
     * </p>
     *
     * @param b2 The second box.
     * @param s  The scanner for user input.
     */
    private static void updatedSecondBox(Box b2, Scanner s) {
        System.out.println("Please enter a new height for your second box: ");
        b2.setHeight(s.nextDouble());
        System.out.println("Please enter a new width for your second box: ");
        b2.setWidth(s.nextDouble());
        System.out.println("Please enter a new depth for your second box: ");
        b2.setDepth(s.nextDouble());
        System.out.println(
                "Please enter " + "true or false on if the box is full: ");
        b2.setFull(s.nextBoolean());
        System.out.println("Updated Second Box (toString): " + b2.toString());
        System.out
                .println("The updated height, width, depth of the first box is "
                        + b2.getHeight() + ", " + b2.getWidth() + ", and "
                        + b2.getDepth() + ", respectively. It is "
                        + b2.getFull()
                        + " that the updated first box is full.");
    }
}
