package ca.bcit.comp1510.lab2;

/**
 * Students.
 * 
 * Demonstrates the use of escape sequences, addition, and String concatenation
 * to make a table
 * 
 * @author Benedict Halim
 * @version 2019 v5.0
 */
public class Students {
    
    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        int joeLab = 43;
        int joeBonus = 7;
        int joeTotal = joeLab + joeBonus;
        
        int williamLab = 50;
        int williamBonus = 8;
        int williamTotal = williamLab + williamBonus;
        
        int marySueLab = 39;
        int marySueBonus = 10;
        int marySueTotal = marySueLab + marySueBonus;
        
        int pengLab = 87;
        int pengBonus = 6;
        int pengTotal = pengLab + pengBonus;
        
        int kwanLab = 99;
        int kwanBonus = 0;
        int kwanTotal = kwanLab + kwanBonus;
        
        System.out.println(
                "///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("==\t    Student Points\t    ==");
        System.out.println(
                "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////////");
        
        System.out.println(
                "Name" + "\t\t" + "Lab" + "\t" + "Bonus" + "\t" + "Total");
        System.out.println(
                "----" + "\t\t" + "---" + "\t" + "-----" + "\t" + "-----");
        
        System.out.println(
                "Joe" + "\t\t" + joeLab + "\t" + joeBonus + "\t" + (joeTotal));
        System.out.println("William" + "\t\t" + williamLab + "\t" + williamBonus
                + "\t" + (williamTotal));
        System.out.println("Mary Sue" + "\t" + marySueLab + "\t" + marySueBonus
                + "\t" + (marySueTotal));
        System.out.println("Peng" + "\t\t" + pengLab + "\t" + pengBonus + "\t"
                + (pengTotal));
        System.out.println("Kwan" + "\t\t" + kwanLab + "\t" + kwanBonus + "\t"
                + (kwanTotal));
    }
    
}
