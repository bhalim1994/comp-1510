package q2;

import java.util.Scanner;

/**
 * <p>
 * Demonstrates the use of the division and modulus operator by taking an input
 * and converting the inputed seconds into hh:mm:ss format.
 * </p>
 *
 * @author Benedict Halim, Set 1B
 * @version 1.0
 */
public class SecondsConvert {
    /**
     * <p>
     * Drives the program.
     * </p>
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        // Hour represented in seconds.
        final int secondsPerHour = 3600;
        // Minute represented in seconds.
        final int secondsPerMinute = 60;
        // Seconds.
        final int secondsPerSecond = 1;
        
        // Prompts, scans, and stores inputed seconds.
        Scanner scan = new Scanner(System.in);
        System.out.println(
                "Please enter the seconds you'd like to convert into hh:mm:ss");
        int inputtedSeconds = scan.nextInt();
        
        // Calculate hours from inputed seconds & stores leftover seconds.
        int hour;
        hour = inputtedSeconds / secondsPerHour;
        inputtedSeconds %= secondsPerHour;
        
        // Calculate minutes from inputed seconds & stores leftover seconds.
        int minute;
        minute = inputtedSeconds / secondsPerMinute;
        inputtedSeconds %= secondsPerMinute;
        
        // Calculate seconds from inputed seconds.
        int second;
        second = inputtedSeconds / secondsPerSecond;
        
        // Outputs seconds into hh:mm:ss format.
        System.out.println("The converted seconds to hh:mm:ss format is " + hour
                + ":" + minute + ":" + second);
        
        // Close scan object.
        scan.close();
    }
    
};
