package q4;

import q3.Address;
import q3.Student;

/**
 * <p>
 * TestCourse.
 * 
 * Tests the Course object.
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */
public class TestCourse {
    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM.
     * </p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Course myCourse = new Course("Java Foundations of Program Design");
        System.out.println("Before adding students...");
        myCourse.roll();
        System.out.println("The average is:\n" + myCourse.average());
        Address student12HomeAddress = new Address("13151 108 Ave", "Surrey",
                "BC", "V3T 2J2");
        Address student345HomeAddress = new Address("555 Ave", "Vancouver",
                "BC", "V69 4Z0");
        Address studentSchoolAddress = new Address("3700 Willingdon Ave",
                "Burnaby", "BC", "V5G 3H2");
        final int student1Score1 = 98;
        final int student1Score2 = 99;
        final int student1Score3 = 100;
        myCourse.addStudent(new Student("Ben", "Halim", student12HomeAddress,
                studentSchoolAddress, student1Score1, student1Score2,
                student1Score3));
        final int student2Score1 = 95;
        final int student2Score2 = 96;
        final int student2Score3 = 97;
        myCourse.addStudent(new Student("Saki", "Kurano", student12HomeAddress,
                studentSchoolAddress, student2Score1, student2Score2,
                student2Score3));
        final int student3Score1 = 69;
        final int student3Score2 = 69;
        final int student3Score3 = 69;
        myCourse.addStudent(new Student("Scott", "Lai", student345HomeAddress,
                studentSchoolAddress, student3Score1, student3Score2,
                student3Score3));
        final int student4Score1 = 92;
        final int student4Score2 = 93;
        final int student4Score3 = 94;
        myCourse.addStudent(new Student("Leon", "Wu", student345HomeAddress,
                studentSchoolAddress, student4Score1, student4Score2,
                student4Score3));
        final int student5Score1 = 89;
        final int student5Score2 = 90;
        final int student5Score3 = 91;
        myCourse.addStudent(new Student("Kurt", "Milan", student345HomeAddress,
                studentSchoolAddress, student5Score1, student5Score2,
                student5Score3));
//        myCourse.addStudent(new Student("EvilBen", "EvilHalim",
//                studentHomeAddress, studentSchoolAddress, student1Score1,
//                student1Score2, student1Score3));
        System.out.println("\nAfter adding students...");
        myCourse.roll();
        System.out.println("\nThe course average is:\n" + myCourse.average());
        
    }
    
};
