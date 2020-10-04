//**************************************************************************************************************
// CLASS: BinaryOperator
//
// AUTHOR
// Travis Ashcraft (tcashcra@asu.edu)
// Computer Science & Engineering Program
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// Web: Travisashcraft.github.io
//**************************************************************************************************************

/**
 * BinaryOperator is the superclass of all binary operators.
 */
public abstract class BinaryOperator extends Operator {

    public BinaryOperator() {
    }

    /**
     * Called to evaluate the operator.
     */
    public abstract Operand evaluate(Operand pLhsOperand, Operand pRhsOperand);

    /**
     * Returns true since all subclasses of BinaryOperator are binary operators.
     */
    @Override
    public boolean isBinaryOperator() {
        return true;
    }

}
