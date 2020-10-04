//**************************************************************************************************************
// CLASS: Operator
//
// AUTHOR
// Travis Ashcraft (tcashcra@asu.edu)
// Computer Science & Engineering Program
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// Web: Travisashcraft.github.io
//**************************************************************************************************************

/**
 * Operator is the superclass of all binary and unary operators.
 */
public abstract class Operator extends Token{
    public Operator(){
    }

    public abstract boolean isBinaryOperator();


    public abstract int precedence();


    public abstract int stackPrecendce();

    public abstract String toString();

}
