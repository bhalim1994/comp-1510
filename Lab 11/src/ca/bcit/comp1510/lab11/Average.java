/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * <p>
 * Average.
 * 
 * Calculates the average of inputed numbers.
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */
public class Average {
    
    /**
     * Uses command line to input the number to be calculated.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        double sum = 0.0;
        
        while (args.length != i && args[i] != null) {
            System.out.println(args[i]);
            
            try {
                sum += Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Input #" + (i + 1) + " is not an integer.");
                j++;
            }
            
            i++;
        }
        if (i == 0) {
            System.out.println("No arguments");
        } else if (i - j == 0) {
            System.out.println("No valid arguments");
        } else {
            System.out.println("The average is: " + sum / (i - j));
        }
        
    }
    
}