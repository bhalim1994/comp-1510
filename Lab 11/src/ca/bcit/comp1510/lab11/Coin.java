package ca.bcit.comp1510.lab11;

/**
 * <p>
 * Coin.
 * 
 * Represents a two-sided coin that can be flipped.
 * 
 * </p>
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @author Benedict Halim
 * @version 1.0
 */
public class Coin implements Lockable {
    /**
     * Constant for heads.
     */
    public static final int HEADS = 0;
    
    /**
     * Constant for tails.
     */
    public static final int TAILS = 1;
    
    /**
     * The coin's face currently showing.
     */
    private int face;
    
    /**
     * The key corresponding to the lock.
     */
    private int key;
    
    /**
     * True if object is locked, false otherwise.
     */
    private boolean locked = true;
    
    /**
     * Constructor for Coin object. Initially flips it to give it a face.
     */
    public Coin() {
        flip();
    }
    
    /**
     * Flips Coin and gives a random face value.
     */
    public void flip() {
        if (!locked) {
            face = (int) (2 * Math.random());
        } else {
            System.out.println("Not allowed to flip, the coin is locked.");
        }
        
    }
    
    /**
     * Tests if the current face is heads.
     * 
     * @return True if the current face is heads, false otherwise.
     */
    public boolean isHeads() {
        return (face == HEADS);
    }
    
    /**
     * Returns the Coin's current face as a string.
     * 
     * @return toString description
     */
    public String toString() {
        String currentFace;
        
        if (face == HEADS) {
            currentFace = "Heads";
        } else {
            currentFace = "Tails";
        }
        
        return currentFace;
    }
    
    @Override
    /**
     * Sets the key.
     * 
     * @param key an integer for the key
     */
    public void setKey(int k) {
        key = k;
        
    }
    
    @Override
    /**
     * Locks the object.
     * 
     * @param enterKey an integer for the key
     * @return boolean whether this object is locked or not
     */
    public boolean lock(int k) {
        if (k == key) {
            locked = true;
            return true;
        }
        return false;
    }
    
    /**
     * Unlocks the object.
     * 
     * @param k an integer for the key
     * @return boolean whether this object is unlocked or not
     */
    public boolean unlock(int k) {
        if (k == key) {
            locked = false;
            return true;
        }
        return false;
    }
    
    @Override
    /**
     * Whether the object is locked or not.
     * 
     * @return True if object is locked, false otherwise.
     */
    public boolean locked() {
        return locked;
        
    }
}
