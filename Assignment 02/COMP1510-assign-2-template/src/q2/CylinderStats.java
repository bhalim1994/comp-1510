package q2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * <p>
 * CylinderStats.
 * 
 * Creates a cylinder.
 * </p>
 *
 * @author Benedict Halim
 * @version 2.0
 */
public class CylinderStats {
    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM.
     * </p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // Declares radius and height
        double radius;
        double height;
        
        // Declares and initializes scanner object for user input
        Scanner scan = new Scanner(System.in);
        // Formatter for 4 decimal digits
        DecimalFormat formatter = new DecimalFormat("0.0000");
        
        // Asks for user input for radius and height, respectively
        System.out.println("Please enter your cylinder's radius in cm: ");
        radius = scan.nextDouble();
        System.out.println("Please enter your cylinder's height in cm: ");
        height = scan.nextDouble();
        
        // Calculates surface area and volume from inputed radius and height
        cylinderSurfaceArea(radius, height, formatter);
        cylinderVolume(radius, height, formatter);
        
        // Close scanner object
        scan.close();
    }
    
    /**
     * <p>
     * Calculates the cylinder's surface area.
     * </p>
     *
     * @param r     Cylinder's radius
     * @param h     Cylinder's height
     * @param fmter The decimal formatter
     */
    private static void cylinderSurfaceArea(double r, double h,
            DecimalFormat fmter) {
        double surfaceArea = 2 * Math.PI * r * (r + h);
        System.out.println("Your cylinder's surface area is: "
                + fmter.format(surfaceArea) + " cm^2.");
    }
    
    /**
     * <p>
     * Calculates the cylinder's volume.
     * </p>
     *
     * @param r     Cylinder's radius
     * @param h     Cylinder's height
     * @param fmter The decimal formatter
     */
    private static void cylinderVolume(double r, double h,
            DecimalFormat fmter) {
        double volume = Math.PI * Math.pow(r, 2) * h;
        System.out.println("Your cylinder's volume is: " + fmter.format(volume)
                + " cm^3.");
    }
};
