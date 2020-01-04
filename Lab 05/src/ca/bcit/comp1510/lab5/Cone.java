package ca.bcit.comp1510.lab5;

/**
 * Cone.
 * 
 * Demonstrates the use of a constructor and its helper functions through a Cone
 * object.
 * 
 * @author Benedict Halim
 * @version 2.0
 *
 */
public class Cone {
    
    // 3. Private instance variables.
    /**
     * Cone's radius.
     */
    private double radius;
    /**
     * Cone's height.
     */
    private double height;
    
    // 4. Constructor
    /**
     * Constructs a Cone object that has a radius and height.
     * 
     * @param h Cone's height.
     * @param r Cone's radius.
     */
    public Cone(double r, double h) {
        radius = r;
        height = h;
    }
    
    // 5. Accessors
    /**
     * Gets the cone's radius.
     * 
     * @return The cone's radius.
     */
    public double getRadius() {
        return radius;
    }
    
    /**
     * Gets the cone's height.
     * 
     * @return The cone's height.
     */
    public double getHeight() {
        return height;
    }
    
    /**
     * Sets the cone's radius.
     * 
     * @param r Cone's radius.
     */
    public void setRadius(double r) {
        radius = r;
    }
    
    /**
     * Sets the cone's height.
     * 
     * @param h Cone's height.
     */
    public void setHeight(double h) {
        height = h;
    }
    
    // 6.
    /**
     * Calculates the cone's volume.
     * 
     * @return The cone's volume.
     */
    public double volume() {
        final double coefficient = 1;
        final int exponent = 2;
        final double denominator = 3;
        return (coefficient * Math.PI * Math.pow(radius, exponent) * height)
                / denominator;
    }
    
    // 7.
    /**
     * Calculates the cone's slant height.
     * 
     * @return The cone's slant height.
     */
    public double slantHeight() {
        final int exponent = 2;
        return Math
                .sqrt(Math.pow(radius, exponent) + Math.pow(height, exponent));
    }
    
    // 8.
    /**
     * Calculates the cone's surface area.
     * 
     * @return The cone's surface area.
     */
    public double surfaceArea() {
        final int exponent = 2;
        return (Math.PI * Math.pow(radius, exponent))
                + ((Math.PI * radius) * (Math.sqrt(Math.pow(radius, exponent)
                        + Math.pow(height, exponent))));
    }
    
    // 9.
    /**
     * Returns the cone's radius and height.
     * 
     * @return A concatenation of the cone's radius and height.
     */
    public String toString() {
        return "Radius: " + radius + "\n" + "Height: " + height;
    }
    
}
