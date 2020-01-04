/**
 * 
 */
package ca.bcit.comp1510.lab9;

/**
 * <p>
 * Cat.
 * 
 * Creates a Cat object.
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */
public class Cat {
    
    /**
     * Name of cat.
     */
    private final String name;
    
    /**
     * Age of cat.
     */
    private int age;
    
    /**
     * Constructor for cat object, defining a name and age (Has trim if the user
     * only inputs spaces).
     * 
     * @param n The cat's name
     * @param a The cat's age
     */
    public Cat(String n, int a) {
        if (n.trim().isEmpty()) {
            name = "Cleo";
        } else {
            name = n;
        }
        
        if (a < 0) {
            age = 0;
        } else {
            age = a;
        }
    }
    
    /**
     * Constructs a Cat object by only defining its age.
     * 
     * @param a The cat's age
     */
    public Cat(int a) {
        name = "Cleo";
        
        if (a < 0) {
            age = 0;
        } else {
            age = a;
        }
    }
    
    /**
     * Getter for the cat's name.
     * 
     * @return String The cat's name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Getter for the cat's age.
     * 
     * @return integer The cat's age.
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Setter for the cat's age.
     * 
     * @param a The cat's age.
     */
    public void setAge(int a) {
        age = a;
    }
    
    /**
     * Returns the cat's name and age.
     * 
     * @return String A string which indicates the cat's name and age.
     */
    public String toString() {
        return "This cat's name is " + name + " age is " + age + " years old.";
    }
    
}