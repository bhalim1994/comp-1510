package ca.bcit.comp1510.lab4;

/**
 * NameTest.
 * 
 * Tests the Student class.
 *
 * @author Benedict Halim
 * @version 2019 v1.0
 */
public class StudentTest {
    
    /**
     * Drives the program.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {
        final int yob = 1994;
        final double gpa = 4.0;
        
        Student myStudent = new Student("Benedict", "Halim", yob, "A01234567",
                gpa);
        System.out.println(myStudent.toString());
        
    }
    
}
