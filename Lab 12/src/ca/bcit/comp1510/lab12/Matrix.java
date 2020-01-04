/**
 * 
 */
package ca.bcit.comp1510.lab12;

/**
 * <p>
 * Matrix.
 * 
 * Constructs a two-dimensional array (A matrix).
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */
public class Matrix {
    /**
     * Two-dimensional array (Matrix)
     */
    private int[][] matrix;
    
    /**
     * Constructor for the matrix by defining its number of rows and columns.
     * 
     * @param r an integer for the number of rows
     * @param c an integer for the number of columns
     */
    public Matrix(int r, int c) {
        matrix = new int[r][c];
    }
    
    /**
     * Getter for the number of rows.
     * 
     * @return the number of rows as an integer
     */
    public int getRows() {
        return matrix.length;
    }
    
    /**
     * Getter for the number of columns.
     * 
     * @return the number of columns as an integer
     */
    public int getColumns() {
        return matrix[0].length;
    }
    
    /**
     * Gives the value in a specific row and column.
     * 
     * @param r an integer for the specified row
     * @param c an integer for the specified column
     * @return the value as an integer
     */
    public int getValue(int r, int c) {
        return matrix[r][c];
    }
    
    /**
     * Setter for the value of a specific element.
     * 
     * @param v an integer for the value
     * @param r an integer for the specified row
     * @param c an integer for the specified column
     */
    public void setValue(int v, int r, int c) {
        matrix[r][c] = v;
    }
    
    /**
     * Add two matrices together.
     * 
     * @param other a Matrix object as the other matrix
     * @return The sum of the two matrices as a Matrix object
     */
    public Matrix add(Matrix other) {
        if (this.getRows() != other.getRows()
                || this.getColumns() != other.getColumns()) {
            throw new IllegalArgumentException("The matrix sizes don't match.");
        } else {
            Matrix sum = new Matrix(this.getRows(), this.getColumns());
            for (int i = 0; i < this.getRows(); i++) {
                for (int j = 0; j < this.getColumns(); j++) {
                    sum.setValue(this.getValue(i, j) + other.getValue(i, j), i,
                            j);
                }
            }
            return sum;
        }
    }
    
    /**
     * Multiply two matrices together.
     * 
     * @param other a Matrix object as the other matrix
     * @return The product of the two matrices as a Matrix object
     */
    public Matrix multiply(Matrix other) {
        if (this.getColumns() != other.getRows()) {
            throw new IllegalArgumentException(
                    "The first matrix's columns don't match"
                            + " the second matrix's rows.");
        } else {
            Matrix product = new Matrix(this.getRows(), other.getColumns());
            
            for (int i = 0; i < this.getRows(); i++) {
                for (int j = 0; j < other.getColumns(); j++) {
                    int value = 0;
                    for (int k = 0; k < this.getColumns(); k++) {
                        product.setValue(value += this.getValue(i, k)
                                * other.getValue(k, j), i, j);
                    }
                }
            }
            return product;
        }
    }
    
    /**
     * A description of the matrix.
     * 
     * @return The matrix's description as a String
     */
    public String toString() {
        String matrixString = "";
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixString += matrix[i][j] + "\t";
            }
            matrixString += "\n";
            
        }
        
        return matrixString;
    }
    
}