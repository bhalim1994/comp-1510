/**
 * 
 */
package ca.bcit.comp1510.lab5;

/**
 * Sphere.
 * 
 * Demonstrates the use of a constructor and its helper functions through a
 * Sphere object.
 * 
 * @author Benedict Halim
 * @version 2.0
 *
 */
public class Sphere {
    
    // 2. Private instance variables
    /**
     * Sphere's x coordinate.
     */
    private double xCoordinate;
    /**
     * Sphere's y coordinate.
     */
    private double yCoordinate;
    /**
     * Sphere's z coordinate.
     */
    private double zCoordinate;
    /**
     * Sphere's radius.
     */
    private double radius;
    
    // 3. Constructor
    /**
     * Constructs a Sphere object that has an x coordinate, y coordinate, z
     * coordinate, and radius.
     * 
     * @param x Sphere's x coordinate.
     * @param y Sphere's y coordinate.
     * @param z Sphere's z coordinate.
     * @param r Sphere's radius.
     */
    public Sphere(double x, double y, double z, double r) {
        xCoordinate = x;
        yCoordinate = y;
        zCoordinate = z;
        radius = r;
    }
    
    // 4. Accessors
    
    /**
     * Gets the sphere's x coordinate.
     * 
     * @return The sphere's x coordinate.
     */
    public double getXCoordinate() {
        return xCoordinate;
    }
    
    /**
     * Gets the sphere's y coordinate.
     * 
     * @return The sphere's y coordinate.
     */
    public double getYCoordinate() {
        return yCoordinate;
    }
    
    /**
     * Gets the sphere's z coordinate.
     * 
     * @return The sphere's z coordinate.
     */
    public double getZCoordinate() {
        return zCoordinate;
    }
    
    /**
     * Gets the sphere's radius.
     * 
     * @return The sphere's radius.
     */
    public double getRadius() {
        return radius;
    }
    
    // 4. Mutators
    
    /**
     * Sets the sphere's x coordinate.
     * 
     * @param x Sphere's x coordinate.
     */
    public void setXCoordinate(double x) {
        xCoordinate = x;
    }
    
    /**
     * Sets the sphere's y coordinate.
     * 
     * @param y Sphere's y coordinate.
     */
    public void setYCoordinate(double y) {
        yCoordinate = y;
    }
    
    /**
     * Sets the sphere's y coordinate.
     * 
     * @param z Sphere's z coordinate.
     */
    public void setZCoordinate(double z) {
        zCoordinate = z;
    }
    
    /**
     * Sets the sphere's radius.
     * 
     * @param r Sphere's radius.
     */
    public void setRadius(double r) {
        radius = r;
    }
    
    // 5 & 6. Helper methods
    
    /**
     * Calculates the sphere's surface area.
     * 
     * @return The sphere's surface area.
     */
    public double surfaceArea() {
        final double coefficient = 4;
        final int exponent = 2;
        return coefficient * Math.PI * Math.pow(radius, exponent);
    }
    
    /**
     * Calculates the sphere's volume.
     * 
     * @return The sphere's volume.
     */
    public double volume() {
        final double coefficient = 4;
        final int exponent = 3;
        final double denominator = 3;
        return (coefficient * Math.PI * Math.pow(radius, exponent)
                / denominator);
    }
    
    // 7. toString method
    
    /**
     * Returns the sphere's X, Y, Z coordinates and its radius.
     * 
     * @return A concatenation of the sphere's 3 coordinates and radius.
     */
    public String toString() {
        return "Sphere's X-Coordinate: " + xCoordinate + "\n"
                + "Sphere's Y-Coordinate: " + yCoordinate + "\n"
                + "Sphere's Z-Coordinate: " + zCoordinate + "\n"
                + "Sphere's Radius: " + radius;
    }
    
}
