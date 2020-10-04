//**************************************************************************************************************
// CLASS: NegOperator
//
// AUTHOR
// Travis Ashcraft (tcashcra@asu.edu)
// Computer Science & Engineering Program
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// Web: Travisashcraft.github.io
//**************************************************************************************************************

/**
 * Represents the negation operator which is a specific type of unary operator.
 */
class NegOperator extends UnaryOperator{
    public NegOperator(){
    }
    //Takes in an Operand and returns the negative of that Operand
    @Override
    public Operand evaluate(Operand pOperand){
        return new Operand(pOperand.getValue() * -1);
    }

    @Override
    public int precedence(){
        return 4;
    }

    @Override
    public int stackPrecendce(){
        return 4;
    }

    //Provided for debugging
    @Override
    public String toString() {
        return "-";
    }
}