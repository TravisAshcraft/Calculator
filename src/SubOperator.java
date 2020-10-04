//**************************************************************************************************************
// CLASS: SubOperator
//
// AUTHOR
// Travis Ashcraft (tcashcra@asu.edu)
// Computer Science & Engineering Program
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// Web: Travisashcraft.github.io
//**************************************************************************************************************

/**
 * Represents the subtraction operator which is a specific type of binary operator.
 */
public class SubOperator extends BinaryOperator{
    public SubOperator(){
    }

    /*
     * Evaluates an subtraction expression returning a Double.
     */
    @Override
    public Operand evaluate(Operand pLhsOperand, Operand pRhsOperand) {
        return new Operand(pLhsOperand.getValue() - pRhsOperand.getValue());
    }

    /*
     * Returns the mathematical precedence for this operator.
     */
    @Override
    public int precedence() {
        return 2;
    }

    /*
     * Returns the STACK precedence for this operator.
     */
    @Override
    public int stackPrecendce() {
        return 2;
    }

    /*
     * Provides a visual for debugging.
     */
    @Override
    public String toString() {
        return " - ";
    }

}