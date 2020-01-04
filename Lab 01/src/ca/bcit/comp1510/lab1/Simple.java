package ca.bcit.comp1510.lab1;

public class Simple {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("I love Java");
    }
}
/**
 * 1. simple: In general terms, it is a legal identifier but when the class
 * Simple.java is in the same program, it is not, as there is a class with the
 * same name but different case exists. It is also not a good choice to name a
 * class starting with a lower case letter.
 * 
 * 2. SimpleProgram: Yes, it is a legal identifier but it might not be the best
 * choice to name our program as it is redundant. Naming the program Simple is
 * descriptive enough.
 * 
 * 3. 1Simple: No, it is not a legal identifier as it begins with a digit.
 * 
 * 4. _Simple_: Yes, it is a legal identifier. You can name it with _, but it is
 * not required in Java and thus rarely used (In contrast, it's used in C++ due
 * to the way their constructors' syntaxes differ).
 * 
 * 5. *Simple*: No, it is not a legal identifier as it contains a * symbol.
 * 
 * 6. $123_45: Yes, it is a legal identifier. No, it is not a good choice to
 * name our program as Java type names usually don't contain the $ character.
 * 
 * 7. Simple!: No, it is not a legal identifier as it contains a ! symbol.
 */
