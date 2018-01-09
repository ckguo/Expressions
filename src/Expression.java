import java.util.Map;

/**
 * An immutable data type representing a polynomial expression of:
 *   + and *
 *   nonnegative integers and floating-point numbers
 *   variables (case-sensitive nonempty strings of letters)
 */
public interface Expression {
    
    /**
     * Returns a string with one space between each variable and operator, and parentheses around each grouping (which are pairs)
     * @return a string representation of this expression
     */
    @Override 
    public String toString();
    
    /**
     * Adds itself and another expression together
     * @param exp expression
     * @return an expression that is created by adding itself and another expression together
     */
    public Expression add(Expression exp);
    
    /**
     * Multiplies itself and another expression together
     * @param exp expression
     * @return an expression that is created by multiplying itself and another expression together
     */
    public Expression multiply(Expression exp);
    
    /**
     * Returns true iff the expression is a single number.
     * @return boolean
     */
    public boolean hasValue();
    
    /**
     * If the expression is a single number, it returns the value of the expression. Else it returns 0
     * @return double
     */
    public double getValue();
    
    /**
     * Returns an expression that has been simplified such that the following are true:
     * -there is no operation on two doubles
     * -there is no operation that has one argument equal to 0
     * -there is no product operation that has one argument equal to 1
     * @return an expression described above
     */
    public Expression evaluate();
    
    /**
     * Returns an expression with every variable in environment substituted with its value
     * @param environment map of variables to values
     * @return an expression
     */
    public Expression substitute(Map<String,Double> environment);
    
    /**
     * Substitutes each variable with its value as defined in environment, and returns a simplified expression
     * Expression is simplified as documented in the spec for evaluate.
     * @param environment map of variables to values
     * @return a simplified expression
     */
    public Expression simplify(Map<String,Double> environment);
    
}
