//**************************************************************************************************************
// CLASS: RightParen
//
// AUTHOR
// Travis Ashcraft (tcashcra@asu.edu)
// Computer Science & Engineering Program
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// Web: Travisashcraft.github.io
//**************************************************************************************************************

/**
 * Represents a right parenthesis in the expression.
 */
public class RightParen extends Parenthesis {

    public RightParen() {
    }

    /**
     * Right parentheses really don't have precedence since they are not pushed on the operator stack, but we
     * have to override precedence() so we assign the lowest precedence level to RightParen.
     */
    @Override
    public int precedence() {
        return 1;
    }

    /**
     * See comments in precedence().
     */
    @Override
    public int stackPrecendce() {
        return 1;
    }

    @Override
    public String toString() {
        return ")";
    }

}