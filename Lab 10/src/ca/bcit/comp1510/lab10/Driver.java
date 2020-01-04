/**
 * 
 */
package ca.bcit.comp1510.lab10;

import java.util.ArrayList;

/**
 * <p>
 * Driver.
 * 
 * Driver for the Name class.
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */
public class Driver {
    
    /**
     * Creates five Name object in a ArrayList then sorts them in lexicographic
     * order.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        ArrayList<Name> nameList = new ArrayList<Name>();
        
        Name name1 = new Name("Scott", "Duy", "Lai");
        Name name2 = new Name("Scott", null, "Lai");
        Name name3 = new Name("Leon", "Liyuan", "Wu");
        Name name4 = new Name("Tuong", "Duy", "Lai");
        Name name5 = new Name("Tony", "Minseok", "Kim");
        
        nameList.add(name1);
        nameList.add(name2);
        nameList.add(name3);
        nameList.add(name4);
        nameList.add(name5);
        
        System.out.println("Before sorting...");
        for (Name myName : nameList) {
            System.out.println(myName.toString());
        }
        
        nameList.sort(null);
        
        System.out.println("\nAfter sorting...");
        for (Name myName : nameList) {
            System.out.println(myName.toString());
        }
        
    }
    
}