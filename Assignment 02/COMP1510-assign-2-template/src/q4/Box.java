package q4;

/**
 * <p>
 * 
 * Box.
 * 
 * Demonstrates the use of a constructor, accessors, mutators, and helper
 * methods by creating a Box object.
 * 
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */
public class Box {
    /**
     * Box's height.
     */
    private double height;
    /**
     * Box's width.
     */
    private double width;
    /**
     * Box's depth.
     */
    private double depth;
    /**
     * Box is full or not.
     */
    private boolean full;
    
    /**
     * Constructs a Box object that has its height, width, depth, and whether
     * it's full or not.
     * 
     * @param h Box's height
     * @param w Box's width
     * @param d Box's depth
     */
    public Box(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
        full = false;
    }
    
    /**
     * Returns the box's height.
     * 
     * @return The box's height.
     */
    public double getHeight() {
        return height;
    }
    
    /**
     * Returns box's width.
     * 
     * @return The box's width.
     */
    public double getWidth() {
        return width;
    }
    
    /**
     * Returns the box's depth.
     * 
     * @return The box's depth.
     */
    public double getDepth() {
        return depth;
    }
    
    /**
     * Returns whether the box is full or not.
     * 
     * @return The box is filled (true) or not (false).
     */
    public boolean getFull() {
        return full;
    }
    
    // setter
    /**
     * Sets the box's height.
     * 
     * @param h The box's height.
     */
    public void setHeight(double h) {
        height = h;
    }
    
    /**
     * Sets the box's width.
     * 
     * @param w The box's width.
     */
    public void setWidth(double w) {
        width = w;
    }
    
    /**
     * Sets the box's depth.
     * 
     * @param d The box's depth.
     */
    public void setDepth(double d) {
        depth = d;
    }
    
    /**
     * Sets whether the box is full (true) or not full (false).
     * 
     * @param f The box is full (true) or not full (false).
     */
    public void setFull(boolean f) {
        full = f;
    }
    
    /**
     * Returns the height, width, and depth of the box.
     * 
     * @return Description of the box's height, width, depth, and whether it's
     *         full.
     */
    public String toString() {
        return ("The box's height, width, and depth are " + height + ", "
                + width + ", and " + depth + ", respectively. It is " + full
                + " that the box is full.");
    }
};
