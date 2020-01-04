package q3;

import java.text.DecimalFormat;

/**
 * <p>
 * Student.
 * 
 * Represents a BCIT student.
 * </p>
 * 
 * @author Benedict Halim
 * @version 1.0
 */
public class Student {
    /**
     * <p>
     * First name of this student.
     * </p>
     */
    private String firstName;
    
    /**
     * <p>
     * Last name of this student.
     * </p>
     */
    private String lastName;
    
    /**
     * <p>
     * Home address of this student. Can be shared by other students.
     * </p>
     */
    private Address homeAddress;
    
    /**
     * <p>
     * School address of this student. Can be shared by other students.
     * </p>
     */
    private Address schoolAddress;
    
    /**
     * <p>
     * The first test score of this student.
     * </p>
     */
    private int testScore1;
    
    /**
     * <p>
     * The second test score of this student.
     * </p>
     */
    private int testScore2;
    
    /**
     * <p>
     * The third test score of this student.
     * </p>
     */
    private int testScore3;
    
    /**
     * The maximum number of tests.
     */
    private final int numOfTests = 3;
    
    /**
     * <p>
     * Constructs a Student object that contains the specified values.
     * </p>
     * 
     * @param first  a String representing the first name
     * @param last   a String representing the last name
     * @param home   an Address object containing the home address
     * @param school an Address object containing the school address
     */
    public Student(String first, String last, Address home, Address school) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
    }
    
    /**
     * <p>
     * Constructs a Student object that contains the specified values.
     * </p>
     * 
     * @param first  a String representing the first name
     * @param last   a String representing the last name
     * @param home   an Address object containing the home address
     * @param school an Address object containing the school address
     * @param score1 an integer representing the first score
     * @param score2 an integer representing the second score
     * @param score3 an integer representing the third score
     */
    public Student(String first, String last, Address home, Address school,
            int score1, int score2, int score3) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        testScore1 = score1;
        testScore2 = score2;
        testScore3 = score3;
    }
    
    /**
     * <p>
     * Constructs a Student object that contains only their test scores, which
     * are all 0.
     * </p>
     */
    public Student() {
        testScore1 = 0;
        testScore2 = 0;
        testScore3 = 0;
    }
    
    /**
     * <p>
     * Sets the test scores.
     * </p>
     * 
     * @param testNumber an integer representing which test it corresponds to.
     * @param score      an integer representing the score of the test.
     */
    public void setTestScore(int testNumber, int score) {
        if (testNumber <= 0 || testNumber >= numOfTests + 1) {
            throw new IllegalArgumentException(
                    "The test number should be between 1 and " + numOfTests
                            + ".");
        }
        final int one = 1;
        final int two = 2;
        final int three = 3;
        switch (testNumber) {
        case one:
            testScore1 = score;
            break;
        case two:
            testScore2 = score;
            break;
        case three:
            testScore3 = score;
            break;
        default:
            break;
        }
        
    }
    
    /**
     * <p>
     * Gets the test scores.
     * </p>
     * 
     * @param testNumber an integer representing the test number
     * @return The score for the specified test as an integer
     */
    public int getTestScore(int testNumber) {
        if (testNumber <= 0 || testNumber >= numOfTests + 1) {
            throw new IllegalArgumentException(
                    "The test number should be between 1 and " + numOfTests
                            + ".");
        }
        
        switch (testNumber) {
        case 1:
            return testScore1;
        case 2:
            return testScore2;
        default:
            return testScore3;
        }
        
    }
    
    /**
     * <p>
     * Gets the full name of the student.
     * </p>
     * 
     * @return the full name of the student as a String
     */
    public String getFullName() {
        return firstName + " " + lastName;
    }
    
    /**
     * <p>
     * Calculates the average of three test scores.
     * </p>
     * 
     * @return the average of the 3 tests as a double
     */
    public double average() {
        DecimalFormat formatter = new DecimalFormat("0.00");
        
        double sum = (double) testScore1 + testScore2 + testScore3;
        String studentResultFmt = formatter.format(sum / numOfTests);
        return Double.parseDouble(studentResultFmt);
    }
    
    /**
     * <p>
     * Returns a String description of this Student object.
     * </p>
     * 
     * @return description of Student object as a String
     */
    public String toString() {
        String result;
        
        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress + "\n";
        result += "First test score:\n" + testScore1 + "\n";
        result += "Second test score:\n" + testScore2 + "\n";
        result += "Third test score:\n" + testScore3 + "\n";
        result += "Average:\n" + average();
        
        return result;
    }
}
