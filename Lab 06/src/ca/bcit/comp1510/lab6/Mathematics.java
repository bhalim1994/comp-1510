/**
 * 
 */
package ca.bcit.comp1510.lab6;

import java.util.Random;

/**
 * Mathematics.
 * 
 * Calculates some math and geometric functions.
 *
 * @author Benedict Halim
 * @version 2019 v1.0
 */

public class Mathematics {
    
    /**
     * PI constant.
     */
    public static final double PI = 3.14159;
    /**
     * One foot to kilometer ratio.
     */
    public static final double ONE_FOOT_TO_KILOMETRE_RATIO = 0.0003048;
    
    /**
     * Returns the area of the circle with the specified radius.
     *
     * @param radius of the circle.
     * @return area as a double
     */
    public double getCircleArea(double radius) {
        if (radius >= 0) {
            return Math.pow(radius, 2) * PI;
        } else {
            return Double.NaN;
        }
    }
    
    /**
     * Returns the area of the square with the specified edge length.
     *
     * @param edgeLength of the square.
     * @return area as a double
     */
    public double getSquareArea(double edgeLength) {
        if (edgeLength >= 0) {
            return Math.pow(edgeLength, 2);
        } else {
            return Double.NaN;
        }
    }
    
    /**
     * Returns the sum of the specified values.
     *
     * @param first  operand
     * @param second operand
     * @return sum of the operands
     */
    public double add(double first, double second) {
        return first + second;
    }
    
    /**
     * Returns the product of the specified values.
     *
     * @param first  operand
     * @param second operand
     * @return product of the operands
     */
    public double multiply(double first, double second) {
        return first * second;
    }
    
    /**
     * Returns the difference of the specified values.
     *
     * @param first  operand
     * @param second operand
     * @return difference of the operands
     */
    public double subtract(double first, double second) {
        return first - second;
    }
    
    /**
     * Returns the quotient of the specified values. If the divisor is zero,
     * returns zero instead of NaN or infinity.
     *
     * @param first  operand
     * @param second operand
     * @return quotient of the operands
     */
    public double divide(int first, int second) {
        if (second == 0) {
            return 0;
        } else {
            return first / second;
        }
    }
    
    /**
     * Returns the absolute value of the specified integer.
     *
     * @param number to test
     * @return absolute value of number
     */
    public int absoluteValue(int number) {
        if (number > 0) {
            return number;
        } else {
            return -number;
        }
    }
    
    /**
     * Returns a random number between 10 and 20 inclusive, but NOT 15.
     * 
     * @return random number in range [10, 20] excluding 15.
     */
    public int getRandomNumberBetweenTenAndTwentyButNotFifteen() {
        final int fifteen = 15;
        final int range = 11;
        final int moveOver = 10;
        
        int result = fifteen;
        
        Random gen = new Random();
        
        while (result == fifteen) {
            result = gen.nextInt(range) + moveOver;
        }
        return result;
    }
    
    /**
     * Converts the specified number of feet to kilometres.
     * 
     * @param feet to convert
     * @return kilometres in the specified number of feet
     */
    public double convertFeetToKilometres(double feet) {
        return feet * ONE_FOOT_TO_KILOMETRE_RATIO;
    }
    
    /**
     * Returns the sum of the positive integers between 0 and the specified
     * number inclusive. If the specified number is negative, returns zero.
     *
     * @param number upper bound
     * @return sum as an integer
     */
    public int sumOfInts(int number) {
        int i = 0;
        int sum = 0;
        if (number > 0) {
            while (i <= number) {
                sum += i;
                i++;
            }
            return sum;
        } else {
            return 0;
        }
    }
    
    /**
     * Returns true if the specified value is positive, else false.
     *
     * @param number to test
     * @return true if number is positive, else false.
     */
    public boolean isPositive(int number) {
        return number > 0;
    }
    
    /**
     * Returns true if the specified value is even, else false.
     *
     * @param number to test
     * @return true if number is even, else false.
     */
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    /**
     * Returns sum of the even numbers between 0 and the specified value,
     * inclusive.
     *
     * @param number upper bound
     * @return sum of the even numbers between 0 and number
     */
    public int sumOfEvens(int number) {
        int sum = 0;
        int i = 0;
        
        if (number > 0) {
            while (i <= number) {
                sum += i;
                i += 2;
            }
        } else {
            while (i >= number) {
                sum += i;
                i -= 2;
            }
        }
        return sum;
        
    }
    
    /**
     * Returns the sum of the numbers between zero and the first parameter that
     * are divisible by the second number. For example, sumOfProducts(10, 3)
     * will return 3 + 6 + 9 = 18, and sumOfProducts(10, 2) will return 2 + 4 +
     * 6 + 8 + 10 = 30 and sumOfProducts(-10, 2) will return -2 + -4 + -6 + -8 +
     * -10 = -30.
     * 
     * @param bound   the upper bound
     * @param divisor the divisor
     * @return sum
     */
    public int sumOfProducts(int bound, int divisor) {
        int sum = 0;
        int i = 0;
        
        if (bound > 0) {
            while (i <= bound) {
                sum += i;
                i += divisor;
            }
        } else {
            while (i >= bound) {
                sum += i;
                i -= divisor;
            }
        }
        return sum;
    }
    
}
