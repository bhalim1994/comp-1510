/**
 * 
 */
package q4;

import java.text.DecimalFormat;
import java.util.ArrayList;

import q3.Student;

/**
 * <p>
 * Course.
 * 
 * Represents a course.
 * </p>
 * 
 * @author Benedict Halim
 * @version 1.0
 */
public class Course {
    /**
     * <p>
     * Course name.
     * </p>
     */
    private String courseName;
    /**
     * <p>
     * The list of students.
     * </p>
     */
    private ArrayList<Student> studentList = new ArrayList<Student>();
    
    /**
     * <p>
     * Constructs a Course object that contains only the course name.
     * </p>
     * 
     * @param cn a String for the course name
     */
    public Course(String cn) {
        courseName = cn;
    }
    
    /**
     * <p>
     * Adds a Student object to this course.
     * </p>
     * 
     * @param student the Student object to be added to the student list
     */
    public void addStudent(Student student) {
        final int studentLimit = 5;
        if (studentList.size() >= studentLimit) {
            throw new IllegalArgumentException("There are already "
                    + studentLimit + " students in this course.");
        } else {
            studentList.add(student);
        }
        
    }
    
    /**
     * <p>
     * Calculates the average score for all students in this course.
     * </p>
     * 
     * @return The average score as a double
     */
    public double average() {
        double sum = 0;
        DecimalFormat formatter = new DecimalFormat("0.00");
        for (Student student : studentList) {
            sum += student.average();
        }
        if (studentList.size() == 0) {
            return 0.0;
        } else {
            String courseResultFmt = formatter.format(sum / studentList.size());
            return Double.parseDouble(courseResultFmt);
        }
        
    }
    
    /**
     * <p>
     * Prints all the students enrolled in this course.
     * </p>
     * 
     */
    public void roll() {
        if (studentList.size() == 0) {
            System.out.println(
                    "There aren't any students are registered in the course.");
        } else {
            System.out.println("The students enrolled in the course \'"
                    + courseName + "\' are:");
            for (Student student : studentList) {
                System.out.println(student.getFullName());
            }
        }
        
    }
    
}
