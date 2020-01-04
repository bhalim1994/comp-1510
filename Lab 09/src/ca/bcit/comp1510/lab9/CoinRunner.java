/**
 * 
 */
package ca.bcit.comp1510.lab9;

/**
 * <p>
 * 
 * CoinRunner.
 * 
 * Calculates how many times the longest run is in 100 flips of coin.
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */
public class CoinRunner {
    
    /**
     * Instantiates a Coin object, flips the coin 100 times while printing their
     * results, and calculates the longest run of heads.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        Coin coin = new Coin();
        int longestRun = 0;
        int currentRun = 0;
        final int repeat = 100;
        for (int i = 1; i <= repeat; i++) {
            coin.flip();
            System.out.println(coin.toString());
            if (coin.isHeads()) {
                currentRun++;
            }
            if (!coin.isHeads() || i == repeat) {
                if (currentRun > longestRun) {
                    longestRun = currentRun;
                }
                currentRun = 0;
            }
        }
        
        System.out.println("The longest run of heads is " + longestRun + ".");
        
    }
    
}