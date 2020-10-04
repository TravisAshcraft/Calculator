//**************************************************************************************************************
// CLASS: Operand
//
// AUTHOR
// Travis Ashcraft (tcashcra@asu.edu)
// Computer Science & Engineering Program
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// Web: Travisashcraft.github.io
//**************************************************************************************************************

/**
 * An operand is a numeric value represented as a Double.
 */
public class Operand extends Token{
    private double mValue;

    public Operand(double pValue){
        setValue(pValue);
    }

    public void setValue(double mValue){
        this.mValue = mValue;

    }

    public double getValue(){
        return mValue;
    }

    @Override
   public String toString(){
        double s = mValue;
        String d = Double.toString(s);
        return d;
    }

}

