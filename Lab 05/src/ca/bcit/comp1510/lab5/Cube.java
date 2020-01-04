package ca.bcit.comp1510.lab5;

/**
 * Cube.
 * 
 * Demonstrates the use of a constructor and its helper functions through a Cube
 * object.
 * 
 * @author Benedict Halim
 * @version 2.0
 *
 */
public class Cube {
    
    // 2. Private instance variables
    /**
     * Cube's x coordinate.
     */
    private double xCoordinate;
    /**
     * Cube's y coordinate.
     */
    private double yCoordinate;
    /**
     * Cube's z coordinate.
     */
    private double zCoordinate;
    /**
     * Cube's length of edge.
     */
    private double edgeLength;
    
    // 3. Constructor
    /**
     * Constructs a Cube object that has an x coordinate, y coordinate, z
     * coordinate, and edge length.
     * 
     * @param x    Cube's x coordinate.
     * @param y    Cube's y coordinate.
     * @param z    Cube's z coordinate.
     * @param edge Cube's edge length.
     */
    public Cube(double x, double y, double z, double edge) {
        xCoordinate = x;
        yCoordinate = y;
        zCoordinate = z;
        edgeLength = edge;
    }
    
    // 4. Accessors
    
    /**
     * Gets the cube's x coordinate.
     * 
     * @return The cube's x coordinate.
     */
    public double getXCoordinate() {
        return xCoordinate;
    }
    
    /**
     * Gets the cube's y coordinate.
     * 
     * @return The cube's y coordinate.
     */
    public double getYCoordinate() {
        return yCoordinate;
    }
    
    /**
     * Gets the cube's z coordinate.
     * 
     * @return The cube's z coordinate.
     */
    public double getZCoordinate() {
        return zCoordinate;
    }
    
    /**
     * Gets the cube's edge length.
     * 
     * @return The cube's edge length.
     */
    public double getEdgeLength() {
        return edgeLength;
    }
    
    // 4. Mutators.
    
    /**
     * Sets the cube's x coordinate.
     * 
     * @param x Cube's x coordinate.
     */
    public void setXCoordinate(double x) {
        xCoordinate = x;
    }
    
    /**
     * Sets the cube's y coordinate.
     * 
     * @param y Cube's y coordinate.
     */
    public void setYCoordinate(double y) {
        yCoordinate = y;
    }
    
    /**
     * Sets the cube's z coordinate.
     * 
     * @param z Cube's z coordinate.
     */
    public void setZCoordinate(double z) {
        zCoordinate = z;
    }
    
    /**
     * Sets the cube's edge length.
     * 
     * @param edge Cube's edge length.
     */
    public void setEdgeLength(double edge) {
        edgeLength = edge;
    }
    
    // 6.
    /**
     * Calculates the cube's surface area.
     * 
     * @return The cube's surface area.
     */
    public double surfaceArea() {
        final double coefficient = 6;
        final int exponent = 2;
        return coefficient * Math.pow(edgeLength, exponent);
    }
    
    // 7.
    /**
     * Calculates the cube's volume.
     * 
     * @return The cube's volume.
     */
    public double volume() {
        final int exponent = 3;
        return Math.pow(edgeLength, exponent);
    }
    
    // 8.
    /**
     * Calculates the cube's diagonal face.
     * 
     * @return The cube's diagonal face.
     */
    public double faceDiagonal() {
        final double coefficient = Math.sqrt(2);
        return coefficient * edgeLength;
    }
    
    // 9.
    /**
     * Calculates the cube's diagonal space.
     * 
     * @return The cube's diagonal space.
     */
    public double spaceDiagonal() {
        final double coefficient = Math.sqrt(3);
        return coefficient * edgeLength;
    }
    
    // 5. toString method
    /**
     * Returns the cube's X, Y, Z coordinates and its edge length.
     * 
     * @return A concatenation of the cube's 3 coordinates and edge length.
     */
    public String toString() {
        return "Sphere's X-Coordinate: " + xCoordinate + "\n"
                + "Sphere's Y-Coordinate: " + yCoordinate + "\n"
                + "Sphere's Z-Coordinate: " + zCoordinate + "\n"
                + "Sphere's Edge Length: " + edgeLength;
    }
}
