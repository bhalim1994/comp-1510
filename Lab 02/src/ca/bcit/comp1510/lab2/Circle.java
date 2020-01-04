package ca.bcit.comp1510.lab2;

import java.util.Scanner;

/**
 * Circle.
 * 
 * Demonstrates the calculation of some important values for a circle.
 * 
 * @author Benedict Halim
 * @version 2019 v5.0
 */
public class Circle {
    static final double PI = 3.14159;
    
    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        double radius;
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println(
                "Please enter a value in cm for the radius of the circle:");
        radius = myScanner.nextDouble();
        
        double circumference = 2 * PI * radius;
        double area = PI * radius * radius;
        double doubleRadius = 2 * radius;
        double doubleCircumference = 2 * PI * doubleRadius;
        double doubleArea = PI * doubleRadius * doubleRadius;
        
        System.out.println("Your circumference is: " + circumference + " cm");
        System.out.println("Your area is: " + area + " cm");
        System.out
                .println("If you double the radius, your new circumference is: "
                        + doubleCircumference + " cm"
                        + " and your new area is: " + doubleArea + " cm");
        System.out.println(
                "Thus, when the radius is doubled, the circumference is x"
                        + (int) (doubleCircumference / circumference)
                        + " and the area is x" + (int) (doubleArea / area));
        myScanner.close();
    }
    
}
/**
 * 2. Should use double due to its decimal places. We know it's a constant when
 * the variable is in all capital letters. Yes, it compiles.
 * 
 * 10. When we double the radius, the area is quadrupled & the circumference is
 * doubled
 */
