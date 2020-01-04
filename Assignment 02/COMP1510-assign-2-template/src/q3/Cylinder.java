package q3;

import java.text.DecimalFormat;

/**
 * <p>
 * Cylinder.
 * 
 * Demonstrates the use of a constructor, accessors, mutators, and helper
 * methods by creating a Cylinder object.
 * 
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */
public class Cylinder {
    /**
     * Cylinder's radius.
     */
    private double radius;
    /**
     * Cylinder's height.
     */
    private double height;
    /**
     * Formatter to 4 decimal places.
     */
    private DecimalFormat formatter = new DecimalFormat("0.0000");
    
    /**
     * Constructs a Cylinder object with a radius and height.
     * 
     * @param r Cylinder's radius
     * @param h Cylinder's height
     */
    public Cylinder(double r, double h) {
        radius = r;
        height = h;
    }
    
    /**
     * Returns the cylinder's radius.
     * 
     * @return The cylinder's radius.
     */
    public double getRadius() {
        return radius;
    }
    
    /**
     * Returns the cylinder's height.
     * 
     * @return The cylinder's height.
     */
    public double getHeight() {
        return height;
    }
    
    /**
     * Sets the cylinder's radius.
     * 
     * @param r The cylinder's radius.
     */
    public void setRadius(double r) {
        radius = r;
    }
    
    /**
     * Sets the cylinder's height.
     * 
     * @param h The cylinder's height.
     */
    public void setHeight(double h) {
        height = h;
    }
    
    /**
     * Calculates the surface area of the cylinder.
     * 
     * @return The cylinder's surface area.
     */
    public String surfaceArea() {
        String surfaceArea = (formatter
                .format(2 * Math.PI * radius * (radius + height)));
        return surfaceArea;
    }
    
    /**
     * Calculates the volume of the cylinder.
     * 
     * @return The cylinder's volume.
     */
    public String volume() {
        String volume = formatter
                .format(Math.PI * Math.pow(radius, 2) * height);
        return volume;
    }
    
    /**
     * Returns the radius and height of the cylinder.
     * 
     * @return Description of the cylinder's radius and height.
     */
    public String toString() {
        return "The cylinder's radius and height are " + radius + " and "
                + height + ", respectively.";
    }
};
