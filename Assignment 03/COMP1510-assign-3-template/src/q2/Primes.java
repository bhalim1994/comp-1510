package q2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <p>
 * Primes.
 * 
 * Returns the prime numbers.
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */
public class Primes {
    /**
     * <p>
     * A list of primes.
     * </p>
     */
    private static ArrayList<Boolean> primes = new ArrayList<Boolean>();
    
    /**
     * <p>
     * Constructs the Prime object which initializes primes ArrayList to have a
     * maximum index of N.
     * </p>
     * 
     * @param n an integer representing the maximum index
     */
    public Primes(int n) {
        for (int i = 0; i <= n; i++) {
            primes.add(true);
        }
        calculatePrimes(n);
        
    }
    
    /**
     * <p>
     * Calculates which numbers are primes between 0 and N.
     * </p>
     * 
     * @param n an integer representing the maximum index
     */
    private static void calculatePrimes(int n) {
        // Set 0 and 1 to be non-prime numbers as they're not prime numbers
        primes.set(0, false);
        primes.set(1, false);
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (primes.get(i)) {
                for (int j = i + i; j <= n; j += i) {
                    primes.set(j, false);
                }
            }
        }
        
    }
    
    /**
     * <p>
     * Prints all the prime numbers between 0 and N.
     * </p>
     */
    private void printPrimes() {
        System.out.println("The prime numbers between 0 and "
                + (primes.size() - 1) + " are:");
        for (int i = 0; i <= primes.size() - 1; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
            
        }
        System.out.println();
    }
    
    /**
     * <p>
     * Counts how many prime numbers there are between 0 and N.
     * </p>
     * 
     * @return The number of primes between 0 and N as an integer
     */
    private int countPrimes() {
        int primeCounter = 0;
        for (Boolean isPrime : primes) {
            if (isPrime) {
                primeCounter++;
            }
        }
        return primeCounter;
    }
    
    /**
     * <p>
     * Checks if the number is a prime number.
     * </p>
     * 
     * @param x an integer representing the current number of interest
     * @throws ArrayIndexOutOfBoundsException Throws exception if number out of
     *                                        range
     * @return True if the number is a prime, false otherwise as a boolean
     */
    private boolean isPrime(int x) throws ArrayIndexOutOfBoundsException {
        if (x <= -1 || x >= primes.size()) {
            throw new ArrayIndexOutOfBoundsException(
                    "The input for the isPrime method should be between 0 and "
                            + (primes.size() - 1) + ".");
        }
        
        return primes.get(x);
        
    }
    
    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM.
     * </p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Scanner scan;
        boolean hasInputedValidNum = false;
        System.out.println("This program uses the sieve of Eratosthenes "
                + "to determine which numbers are prime.");
        
        while (!hasInputedValidNum) {
            scan = new Scanner(System.in);
            System.out.println("Enter an upper bound:");
            
            try {
                int inputedNumber = scan.nextInt();
                if (inputedNumber >= 2) {
                    Primes inputtedPrime = new Primes(inputedNumber);
                    System.out.println("There are "
                            + inputtedPrime.countPrimes() + " primes:");
                    inputtedPrime.printPrimes();
                    
                    scan.close();
                    hasInputedValidNum = true;
                } else {
                    System.out.println("Invalid input. "
                            + "Please enter an integer greater than 1.");
                }
            } catch (InputMismatchException e) {
                System.out.println(
                        "Invalid input. " + "You inputed a number too high "
                                + "or you did not enter an integer.");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Invalid input. "
                        + "Your inputed index is out of bounds.");
            }
        }
    }
    
}
