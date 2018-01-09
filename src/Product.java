import java.util.Map;

public class Product implements Expression {
    private Expression left;
    private Expression right;
    
    /**
     * Constructs an expression that is the product of the two input expressions (in that order)
     * @param l left expression
     * @param r right expression
     */
    public Product(Expression l, Expression r) {
        this.left = l;
        this.right = r;
    }
    @Override
    public Expression add(Expression exp) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Expression multiply(Expression exp) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean hasValue() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public double getValue() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Expression evaluate() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Expression substitute(Map<String, Double> environment) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Expression simplify(Map<String, Double> environment) {
        // TODO Auto-generated method stub
        return null;
    }

}
