//**************************************************************************************************************
// CLASS: Token
//
// AUTHOR
// Travis Ashcraft (tcashcra@asu.edu)
// Computer Science & Engineering Program
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// Web: Travisashcraft.github.io
//**************************************************************************************************************

/**
 * Token is the abstract superclass of the different types of tokens that can appear in an infix expression.
 */
public abstract class Token {
    public Token() { }
    public abstract String toString();
}
