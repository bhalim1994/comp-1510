package ca.bcit.comp1510.lab4;

/**
 * Student.
 * 
 * Demonstrates the use of a constructor, accessors, and mutators by creating a
 * Student object.
 * 
 * @author Benedict Halim
 * @version 2019 v1.0
 */
public class Student {
    // 7. Private instance variables.
    /**
     * firstName variable.
     */
    private String firstName;
    /**
     * lastName variable.
     */
    private String lastName;
    /**
     * yearOfBirth variable.
     */
    private int yearOfBirth;
    /**
     * studentNumber variable.
     */
    private String studentNumber;
    /**
     * GPA variable.
     */
    private double gpa;
    
    // 8. Constructor
    /**
     * Constructs a Student object.
     * 
     * @param first  Student's first name.
     * @param last   Student's last name.
     * @param yob    Student's year of birth.
     * @param number Student's student number.
     * @param score  Student's GPA score.
     */
    public Student(String first, String last, int yob, String number,
            double score) {
        firstName = first;
        lastName = last;
        yearOfBirth = yob;
        studentNumber = number;
        gpa = score;
    }
    
    // 9. Accessors.
    /**
     * Returns the student's first name.
     * 
     * @return The student's first name.
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Returns the student's last name.
     * 
     * @return The student's last name.
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * Returns the student's year of birth.
     * 
     * @return The student's year of birth.
     */
    public int getYearofBirth() {
        return yearOfBirth;
    }
    
    /**
     * Returns the student's student number.
     * 
     * @return The student's student number.
     */
    public String getStudentNumber() {
        return studentNumber;
    }
    
    /**
     * Returns the student's GPA.
     * 
     * @return The student's GPA.
     */
    public double getGPA() {
        return gpa;
    }
    
    // 9. Mutators
    /**
     * Sets the student's first name.
     * 
     * @param first A string input to first.
     */
    public void setFirstName(String first) {
        firstName = first;
    }
    
    /**
     * Sets the student's last name.
     * 
     * @param last A string input to last.
     */
    public void setLastName(String last) {
        lastName = last;
    }
    
    /**
     * Sets the student's year of birth.
     * 
     * @param year An int input to year.
     */
    public void setYearofBirth(int year) {
        yearOfBirth = year;
    }
    
    /**
     * Sets the student's student number.
     * 
     * @param number A string input to number.
     */
    public void setStudentNumber(String number) {
        studentNumber = number;
    }
    
    /**
     * Sets the student's GPA.
     * 
     * @param score A double input to score.
     */
    public void setGPA(double score) {
        gpa = score;
    }
    
    // 10. toString method
    /**
     * Return all of the student information.
     * 
     * @return The student's information.
     */
    public String toString() {
        return "Student's Full Name: " + firstName + " " + lastName + "\n"
                + "Year of Birth: " + yearOfBirth + "\n" + "Student Number: "
                + studentNumber + "\n" + "GPA: " + gpa;
    }
    
}
