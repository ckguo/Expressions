import java.util.Map;

public class Sum implements Expression {
    private Expression left;
    private Expression right;
    
    /**
     * Constructs an expression that is the sum of the two input expressions (in that order)
     * @param l left expression
     * @param r right expression
     */
    public Sum(Expression l, Expression r) {
        this.left = l;
        this.right = r;
    }
    
    @Override
    public Expression add(Expression exp) {
        return new Sum(this, exp);
    }

    @Override
    public Expression multiply(Expression exp) {
        return new Product(this, exp);
    }

    @Override
    public boolean hasValue() {
        return false;
    }

    @Override
    public double getValue() {
        return 0;
    }

    @Override
    public Expression evaluate() {
        // TODO
        return null;
    }

    @Override
    public Expression substitute(Map<String, Double> environment) {
        return new Sum(this.left.substitute(environment), this.right.substitute(environment));
    }

    @Override
    public Expression simplify(Map<String, Double> environment) {
        return this.substitute(environment).evaluate();
    }

}
