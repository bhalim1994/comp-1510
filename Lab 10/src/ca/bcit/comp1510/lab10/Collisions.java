/**
 * 
 */
package ca.bcit.comp1510.lab10;

/**
 * <p>
 * Collisions.
 * 
 * Creates two entities with random movements and counts how many times they
 * collide.
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */
public class Collisions {
    
    /**
     * Creates two particles with random movements.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        final int firstXCoordinate = -3;
        final int secondXCoordinate = 3;
        final int firstYcoordinate = 0;
        final int secondYcoordinate = 0;
        
        final int boundary = 2000000;
        final int maxSteps = 100000;
        
        int collisions = 0;
        
        RandomWalker particle1 = new RandomWalker(firstXCoordinate,
                firstYcoordinate, maxSteps, boundary);
        RandomWalker particle2 = new RandomWalker(secondXCoordinate,
                secondYcoordinate, maxSteps, boundary);
        
        for (int i = 1; i <= maxSteps; i++) {
            particle1.takeStep();
            particle2.takeStep();
            if (samePosition(particle1, particle2)) {
                collisions++;
            }
        }
        
        System.out.println("Amount of collisions: " + collisions);
        
        // Farthest distance is 100003.
        
    }
    
    /**
     * Checks if the two particles are in the same position.
     * 
     * @param p1 a RandomWalker object representing the first particle
     * @param p2 a RandomWalker object representing the second particle
     * @return True if the two particles are in the same position, false
     *         otherwise
     */
    public static boolean samePosition(RandomWalker p1, RandomWalker p2) {
        return p1.getCurrentX() == p2.getCurrentX()
                && p1.getCurrentY() == p2.getCurrentY();
    }
    
}