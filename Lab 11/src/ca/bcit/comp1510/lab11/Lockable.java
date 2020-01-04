/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * <p>
 * Lockable.
 * 
 * Interface class that functions as a lock.
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */
public interface Lockable {
    /**
     * Sets the key.
     * 
     * @param key an integer for the key
     */
    void setKey(int key);
    
    /**
     * Locks the object.
     * 
     * @param key an integer for the key
     * @return boolean if the object is locked
     */
    boolean lock(int key);
    
    /**
     * Unlocks the object.
     * 
     * @param key an integer for the key
     * @return boolean if the object is locked
     */
    boolean unlock(int key);
    
    /**
     * Returns whether this object is locked or not.
     * 
     * @return boolean True if this object is locked, otherwise false.
     */
    boolean locked();
    
}