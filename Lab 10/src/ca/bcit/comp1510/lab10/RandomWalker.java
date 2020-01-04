/**
 * 
 */
package ca.bcit.comp1510.lab10;

import java.util.Random;

/**
 * <p>
 * RandomWalker.
 * 
 * Represents a random walker.
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */
public class RandomWalker {
    /**
     * The current X-coordinate.
     */
    private int currentX;
    /**
     * The current Y-coordinate.
     */
    private int currentY;
    /**
     * The maximum amount of steps.
     */
    private int maxSteps;
    /**
     * The current steps.
     */
    private int currentSteps;
    /**
     * The boundary.
     */
    private int boundary;
    /**
     * The maximum distance allowed to travel.
     */
    private int maximumDistance;
    
    /**
     * Constructs a random walker object and defines the maximum amount of steps
     * and its boundaries.
     * 
     * @param ms an integer for the maximum amount of steps
     * @param b  an integer for the boundary
     */
    public RandomWalker(int ms, int b) {
        maxSteps = ms;
        boundary = b;
        currentX = 0;
        currentY = 0;
        currentSteps = 0;
        maximumDistance = 0;
    }
    
    /**
     * Constructs a random walker object and defines its current X-coordinate,
     * current Y-coordinate, maximum amount of steps and boundary.
     * 
     * @param cX an integer for the current X-coordinate
     * @param cY an integer for the current Y-coordinate
     * @param ms an integer for the maximum amount of steps
     * @param b  an integer for the boundary
     */
    public RandomWalker(int cX, int cY, int ms, int b) {
        currentX = cX;
        currentY = cY;
        maxSteps = ms;
        boundary = b;
        currentSteps = 0;
        maximumDistance = 0;
    }
    
    /**
     * Moves in a random direction (can only move horizontally or vertically).
     */
    public void takeStep() {
        Random randomGen = new Random();
        final int directions = 4;
        int move = randomGen.nextInt(directions);
        
        switch (move) {
        case 0:
            currentX++;
            break;
        case 1:
            currentY++;
            break;
        case 2:
            currentX--;
            break;
        case 3:
            currentY--;
            break;
        default:
            break;
        }
        
        currentSteps++;
        maximumDistance = max(maximumDistance,
                max(Math.abs(currentX), Math.abs(currentY)));
        
    }
    
    /**
     * Determines if the current steps taken are less than the maximum amount of
     * steps.
     * 
     * @return True if the current steps are less than the maximum amount of
     *         steps, false otherwise.
     */
    public boolean moreSteps() {
        return currentSteps < maxSteps;
    }
    
    /**
     * Determines if the current position is in the boundary.
     * 
     * @return True if the current position is in the boundary, false otherwise.
     */
    public boolean inBounds() {
        int absoluteX = Math.abs(currentX);
        int absoluteY = Math.abs(currentY);
        
        return absoluteX <= boundary && absoluteY <= boundary;
    }
    
    /**
     * Walks until the maximum amount of steps taken or out of bounds.
     */
    public void walk() {
        while (this.moreSteps() && this.inBounds()) {
            this.takeStep();
        }
    }
    
    /**
     * Checks which integer is larger and returns the larger one.
     * 
     * @param a an integer for the first inputed number
     * @param b an integer for the second inputed number
     * @return the larger integer between a and b
     */
    private int max(int a, int b) {
        return (Math.abs(a) > Math.abs(b)) ? Math.abs(a) : Math.abs(b);
    }
    
    /**
     * Getter for the maximum distance.
     * 
     * @return The maximum distance as an integer.
     */
    public int getMaximumDistance() {
        return maximumDistance;
    }
    
    /**
     * Getter for the current X-coordinate.
     * 
     * @return The current X-coordinate as an integer.
     */
    public int getCurrentX() {
        return currentX;
    }
    
    /**
     * Getter for the current Y-coordinate.
     * 
     * @return The current Y-coordinate as an integer.
     */
    public int getCurrentY() {
        return currentY;
    }
    
    /**
     * Gives a description of the random walker (its current position and the
     * number of steps its taken).
     * 
     * @return A description of the random walker as a String.
     */
    public String toString() {
        return "(" + currentX + ", " + currentY + ")" + ", Steps taken: "
                + currentSteps;
    }
    
}
