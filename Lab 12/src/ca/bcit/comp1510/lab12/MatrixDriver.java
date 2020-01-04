/**
 * 
 */
package ca.bcit.comp1510.lab12;

/**
 * <p>
 * MatrixDriver.
 * 
 * Driver for the Matrix class.
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */
public class MatrixDriver {
    
    /**
     * Constructs Matrix objects and tests the Matrix class' methods.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        final int twoMatrixRows = 2;
        final int twoMatrixColumns = 2;
        final int threeMatrixColumns = 3;
        
        final int[] firstMatrixValues = { 2, 3, 4, 5 };
        
        Matrix firstMatrix = new Matrix(twoMatrixRows, twoMatrixColumns);
        
        for (int i = 0; i < twoMatrixRows * twoMatrixColumns;) {
            for (int j = 0; j < twoMatrixRows; j++) {
                for (int k = 0; k < twoMatrixColumns; k++) {
                    firstMatrix.setValue(firstMatrixValues[i], j, k);
                    i++;
                }
            }
        }
        System.out.println("First matrix...\n" + firstMatrix.toString());
        
        final int[] secondMatrixValues = { 1, 2, 3, 4 };
        
        Matrix secondMatrix = new Matrix(twoMatrixRows, twoMatrixColumns);
        
        for (int i = 0; i < twoMatrixRows * twoMatrixColumns;) {
            for (int j = 0; j < twoMatrixRows; j++) {
                for (int k = 0; k < twoMatrixColumns; k++) {
                    secondMatrix.setValue(secondMatrixValues[i], j, k);
                    i++;
                }
            }
        }
        System.out.println("Second matrix...\n" + secondMatrix.toString());
        
        Matrix sumMatrix = firstMatrix.add(secondMatrix);
        System.out.println(
                "Sum of first and second matrix...\n" + sumMatrix.toString());
        
        final int[] rectangleMatrixValues = { 1, 2, 3, 4, 5, 6 };
        
        Matrix rectangleMatrix = new Matrix(twoMatrixRows, threeMatrixColumns);
        
        for (int i = 0; i < twoMatrixRows * threeMatrixColumns;) {
            for (int j = 0; j < twoMatrixRows; j++) {
                for (int k = 0; k < threeMatrixColumns; k++) {
                    rectangleMatrix.setValue(rectangleMatrixValues[i], j, k);
                    i++;
                }
            }
        }
        System.out.println(
                "Rectangular matrix...\n" + rectangleMatrix.toString());
        
        System.out
                .println("Trying to add two matrices with different sizes...");
        try {
            rectangleMatrix.add(firstMatrix);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println();
        
        Matrix productMatrix = secondMatrix.multiply(rectangleMatrix);
        System.out.println("Product of first and second matrix...\n"
                + productMatrix.toString());
        
        System.out.println("Trying to multiply two matrices with non-matching "
                + "columns and rows...");
        try {
            rectangleMatrix.multiply(secondMatrix);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}