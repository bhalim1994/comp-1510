/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * <p>
 * CoinDriver.
 * 
 * Driver for the Coin class.
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */
public class CoinDriver {
    
    /**
     * Creates a Coin object and tries to lock and unlock.
     * 
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        System.out.println("Initializing a Coin object and tries to flip...");
        Coin myCoin = new Coin();
        
        System.out.println("\nSetting a key...");
        final int key = 1111;
        myCoin.setKey(key);
        
        System.out.println("\nUnlock and flip the coin 3 times...");
        myCoin.unlock(key);
        final int flipAmount = 3;
        for (int i = 0; i < flipAmount; i++) {
            myCoin.flip();
            System.out.println(myCoin.toString());
        }
        
        System.out.println("\nLocks the coin and try to flip again...");
        myCoin.lock(key);
        myCoin.flip();
        
    }
    
}