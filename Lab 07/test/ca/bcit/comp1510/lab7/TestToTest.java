package ca.bcit.comp1510.lab7;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * TestToTest.
 * 
 * @author Ben Halim
 * @version 1.0
 */
public class TestToTest {
    /**
     * The ToTest object to test.
     */
    private ToTest toTest;
    
    /**
     * Creates a new ToTest objects before each test is executed.
     * 
     * @throws Exception if a ToTest object cannot be created.
     */
    @BeforeEach
    public void setUp() throws Exception {
        toTest = new ToTest();
    }
    
    /**
     * Test method for largest value when the values inputed are in the order of
     * smallest, middle, and largest.
     */
    @Test
    public void testLargest123() {
        final int largest = 3;
        final int middle = 2;
        final int smallest = 1;
        assertEquals(largest, toTest.largest(smallest, middle, largest));
    }
    
    /**
     * Test method for largest value when the values inputed are in the order of
     * middle, largest, and smallest.
     */
    @Test
    public void testLargest231() {
        final int largest = 3;
        final int middle = 2;
        final int smallest = 1;
        assertEquals(largest, toTest.largest(middle, largest, smallest));
    }
    
    /**
     * Test method for largest value when the values inputed are in the order of
     * largest, middle, and smallest.
     */
    @Test
    public void testLargest321() {
        final int largest = 3;
        final int middle = 2;
        final int smallest = 1;
        assertEquals(largest, toTest.largest(largest, middle, smallest));
    }
    
    /**
     * Test method for largest value when the values inputed has a negative
     * value.
     */
    @Test
    public void testLargestNegative() {
        final int largest = 3;
        final int middle = 2;
        final int smallest = -1;
        assertEquals(largest, toTest.largest(largest, middle, smallest));
    }
    
    /**
     * Test method for largest value when two of the values inputed have the
     * same value and is selected.
     */
    @Test
    public void testLargestTwoSameSelected() {
        final int largest = 2;
        final int middle = 2;
        final int smallest = 1;
        assertEquals(largest, toTest.largest(largest, middle, smallest));
    }
    
    /**
     * Test method for largest value when two of the values inputed have the
     * same value but is not selected.
     */
    @Test
    public void testLargestTwoSameNotSelected() {
        final int largest = 2;
        final int middle = 1;
        final int smallest = 1;
        assertEquals(largest, toTest.largest(largest, middle, smallest));
    }
    
    /**
     * Test method for largest value when the values inputed are all the same.
     */
    @Test
    public void testLargestAllSame() {
        final int largest = 1;
        final int middle = 1;
        final int smallest = 1;
        assertEquals(largest, toTest.largest(largest, middle, smallest));
    }
    
    /**
     * Test method for largest value when the values inputed in an array are in
     * the order of smallest, middle, and largest.
     */
    @Test
    public void testLargestList123() {
        final int largest = 3;
        final int middle = 2;
        final int smallest = 1;
        List<Integer> a = new ArrayList<Integer>();
        a.add(smallest);
        a.add(middle);
        a.add(largest);
        assertEquals(largest, toTest.largest(a));
    }
    
    /**
     * Test method for largest value when the values inputed in an array are in
     * the order of middle, largest, and smallest.
     */
    @Test
    public void testLargestList231() {
        final int largest = 3;
        final int middle = 2;
        final int smallest = 1;
        List<Integer> a = new ArrayList<Integer>();
        a.add(middle);
        a.add(largest);
        a.add(smallest);
        assertEquals(largest, toTest.largest(a));
    }
    
    /**
     * Test method for largest value when the values inputed in an array are in
     * the order of largest, middle, and smallest.
     */
    @Test
    public void testLargestList321() {
        final int largest = 3;
        final int middle = 2;
        final int smallest = 1;
        List<Integer> a = new ArrayList<Integer>();
        a.add(largest);
        a.add(middle);
        a.add(smallest);
        assertEquals(largest, toTest.largest(a));
    }
    
    /**
     * Test method for largest value when the values inputed into the array has
     * a negative value.
     */
    @Test
    public void testLargestListNegative() {
        final int largest = 3;
        final int middle = 2;
        final int smallest = -1;
        List<Integer> a = new ArrayList<Integer>();
        a.add(largest);
        a.add(middle);
        a.add(smallest);
        assertEquals(largest, toTest.largest(a));
    }
    
    /**
     * Test method for largest value when two of the values inputed into the
     * array have the same value and is selected.
     */
    @Test
    public void testLargestListTwoSameSelected() {
        final int largest = 2;
        final int middle = 2;
        final int smallest = 1;
        List<Integer> a = new ArrayList<Integer>();
        a.add(largest);
        a.add(middle);
        a.add(smallest);
        assertEquals(middle, toTest.largest(a));
    }
    
    /**
     * Test method for largest value when two of the values inputed into the
     * array have the same value but is not selected.
     */
    @Test
    public void testLargestListTwoSameNotSelected() {
        final int largest = 2;
        final int middle = 1;
        final int smallest = 1;
        List<Integer> a = new ArrayList<Integer>();
        a.add(largest);
        a.add(middle);
        a.add(smallest);
        assertEquals(largest, toTest.largest(a));
    }
    
    /**
     * Test method for largest value when the values inputed into the array are
     * all the same.
     */
    @Test
    public void testLargestListAllSame() {
        final int largest = 1;
        final int middle = 1;
        final int smallest = 1;
        List<Integer> a = new ArrayList<Integer>();
        a.add(largest);
        a.add(middle);
        a.add(smallest);
        assertEquals(largest, toTest.largest(a));
    }
    
    /**
     * Test method for largest value when only 1 value is inputed into the
     * array.
     */
    @Test
    public void testLargestListOneValue() {
        final int largest = 1;
        List<Integer> a = new ArrayList<Integer>();
        a.add(largest);
        assertEquals(largest, toTest.largest(a));
    }
}
