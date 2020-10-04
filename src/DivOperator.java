//**************************************************************************************************************
// CLASS: DivOperator
//
// AUTHOR
// Travis Ashcraft (tcashcra@asu.edu)
// Computer Science & Engineering Program
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// Web: Travisashcraft.github.io
//**************************************************************************************************************

/**
 * Represents the division operator which is a specific type of binary operator.
 */
public class DivOperator extends BinaryOperator{
    public DivOperator(){
    }
    @Override
    public Operand evaluate(Operand pLhsOperand, Operand pRhsOperand){
        return new Operand(pLhsOperand.getValue() / pRhsOperand.getValue());
    }

    @Override
    public int precedence(){
        return 3;
    }
    @Override
    public int stackPrecendce(){
        return 3;
    }

    @Override
    public String toString() {
        return " / ";
    }
}

