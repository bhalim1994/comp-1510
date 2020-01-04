/**
 * 
 */
package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/**
 * <p>
 * TestWalker.
 * 
 * Driver for the RandomWalker class.
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */
public class TestWalker {
    
    /**
     * Constructs three RandomWalker objects and tests their methods.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        final int maxStepsFirst = 10;
        final int boundaryFirst = 5;
        
        RandomWalker randomWalker1 = new RandomWalker(maxStepsFirst,
                boundaryFirst);
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the maximum amount of steps:");
        int maxStepsSecond = scan.nextInt();
        System.out.println("Enter the boundary size:");
        int boundarySecond = scan.nextInt();
        
        RandomWalker randomWalker2 = new RandomWalker(maxStepsSecond,
                boundarySecond);
        
        System.out.println("\nInitial values...");
        System.out.println("First walker:" + randomWalker1.toString());
        System.out.println("Second walker:" + randomWalker2.toString());
        System.out.println("\nWalking 5 steps...");
        
        final int five = 5;
        for (int i = 1; i <= five; i++) {
            if (randomWalker1.inBounds() && randomWalker1.moreSteps()) {
                randomWalker1.takeStep();
                System.out.println("First Walker: " + randomWalker1);
            }
        }
        System.out.println("Maximum distance travelled from origin: "
                + randomWalker1.getMaximumDistance());
        System.out.println();
        
        for (int i = 0; i < five; i++) {
            if (randomWalker2.inBounds() && randomWalker2.moreSteps()) {
                randomWalker2.takeStep();
                System.out.println("Second Walker: " + randomWalker2);
            }
        }
        System.out.println("Maximum distance travelled from origin: "
                + randomWalker2.getMaximumDistance());
        System.out.println();
        
        final int maxStepsThird = 200;
        final int boundaryThird = 10;
        RandomWalker randomWalker3 = new RandomWalker(maxStepsThird,
                boundaryThird);
        System.out.println("Third walker before walking: " + randomWalker3);
        randomWalker3.walk();
        System.out.println("Third walker after walking: " + randomWalker3);
        System.out.println("Maximum distance travelled from origin: "
                + randomWalker3.getMaximumDistance());
        scan.close();
    }
    
}