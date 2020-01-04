package q3;

/**
 * <p>
 * TestStudent.
 * 
 * Tests the Student object.
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */
public class TestStudent {
    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM.
     * </p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Address student1HomeAddress = new Address("13151 108 Ave", "Surrey",
                "BC", "V3T 2J2");
        Address student1SchoolAddress = new Address("3700 Willingdon Ave",
                "Burnaby", "BC", "V5G 3H2");
        final int student1Score1 = 98;
        final int student1Score2 = 99;
        final int student1Score3 = 100;
        Student student1 = new Student("Benedict", "Halim", student1HomeAddress,
                student1SchoolAddress, student1Score1, student1Score2,
                student1Score3);
        System.out.println(
                "First student information...\n" + student1.toString());
        
        Student student2 = new Student();
        System.out
                .println("\nSecond student information without test scores...\n"
                        + student2.toString());
        final int testNumber1 = 1;
        final int testNumber2 = 2;
        final int testNumber3 = 3;
        final int student2Score1 = 73;
        final int student2Score2 = 51;
        final int student2Score3 = 64;
        student2.setTestScore(testNumber1, student2Score1);
        student2.setTestScore(testNumber2, student2Score2);
        student2.setTestScore(testNumber3, student2Score3);
        System.out.println("\nSecond student information with test scores...\n"
                + student2.toString());
    }
    
};
