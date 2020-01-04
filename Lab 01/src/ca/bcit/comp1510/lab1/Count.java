package ca.bcit.comp1510.lab1;

/**
 * Prints three messages counting from one to five in three different languages.
 * 
 * @author Ben Halim
 * @version 2019v1.0
 */
public class Count {
    public static void main(String[] args) {
        
        // Used to demonstrate an output message counting from 1 to 5 in
        // English
        System.out.println("one two three four five");
        
        // Used to demonstrate an output message counting from 1 to 5 in French
        System.out.println("un deux trois quatre cinq");
        
        // Used to demonstrate an output message counting from 1 to 5 in Spanish
        System.out.println("uno dos tres cuatro cinco");
    }
    
}

/**
 * 5. Yes, it does make my code easier to read as it organizes sections of code
 * (much like paragraphs in an essay).
 * 
 * 6.Exception in thread "main" java.lang.Error: Unresolved compilation
 * problems: Syntax error on token "/", @ expected Used cannot be resolved to a
 * type to cannot be resolved to a type Syntax error on token "an", ; expected
 * output cannot be resolved to a type Syntax error on token "in", ; expected
 * English cannot be resolved to a type Syntax error on token ".", ; expected
 * out cannot be resolved
 * 
 * at ca.bcit.comp1510.lab1.Count.main(Count.java:13)
 * 
 * This error is due to the forward slash (/) specifying a file path
 * 
 * 7. No, this does not cause a problem.
 * 
 * 8. Yes, the assignment does not specify to create header blocks, which is
 * needed in the documentation guidelines. Also finished program before
 * inserting documentation.
 * 
 * a) As it's such a small program, someone might be encouraged to finish the
 * program before inserting documentation.
 * 
 * b) Might assume the reader will know what the program does as it's very
 * simple & may not document comments as precisely and accurately.
 */
