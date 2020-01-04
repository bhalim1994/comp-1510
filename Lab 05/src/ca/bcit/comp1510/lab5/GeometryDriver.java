/**
 * 
 */
package ca.bcit.comp1510.lab5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * GeometryDriver.
 * 
 * Tests the Sphere, Cube, and Cone classes.
 *
 * @author Benedict Halim
 * @version 2.0
 */

public class GeometryDriver {
    
    /**
     * Drives the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        // 2. Scanner object
        Scanner scan = new Scanner(System.in);
        
        // 6. Decimal format
        DecimalFormat df = new DecimalFormat("0.###");
        
        // 3. Sphere
        System.out.println("Please enter the X-Coordinate, Y-Coordinate, "
                + "Z-Coordinate, and radius of your sphere, "
                + "separated by spaces: ");
        Sphere sphere = new Sphere(scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble());
        // Sphere's surface area
        System.out.println("Your sphere's surface area is: "
                + df.format(sphere.surfaceArea()));
        // Sphere's volume
        System.out.println(
                "Your sphere's volume is: " + df.format(sphere.volume()));
        
        // 4. Cube
        System.out.println("Please enter the X-Coordinate, Y-Coordinate, "
                + "Z-Coordinate, and edge length of your cube, "
                + "separated by spaces: ");
        Cube cube = new Cube(scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble());
        // Cube's surface area
        System.out.println("Your cube's surface area is: "
                + df.format(cube.surfaceArea()));
        // Cube's volume
        System.out
                .println("Your cube's volume is: " + df.format(cube.volume()));
        // Cube's diagonal face
        System.out.println("Your cube's diagonal face is: "
                + df.format(cube.faceDiagonal()));
        // Cube's diagonal space
        System.out.println("Your cube's diagonal space is: "
                + df.format(cube.spaceDiagonal()));
        
        // 5. Cone
        System.out.println("Please enter the radius and height of your right "
                + "circular cone, separated by a space: ");
        Cone cone = new Cone(scan.nextDouble(), scan.nextDouble());
        // Cone's volume
        System.out
                .println("Your cone's volume is: " + df.format(cone.volume()));
        // Cone's slant height
        System.out.println("Your cone's slant height is: "
                + df.format(cone.slantHeight()));
        // Cone's surface area
        System.out.println("Your cone's surface area is: "
                + df.format(cone.surfaceArea()));
        
        scan.close();
    }
}
