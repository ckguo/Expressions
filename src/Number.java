import java.util.Map;

public class Number implements Expression {
    private double value;
    
    public Number(double input) {
        this.value = input;
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
        return true;
    }

    @Override
    public double getValue() {
        return this.value;
    }

    @Override
    public Expression evaluate() {
        return this;
    }

    @Override
    public Expression substitute(Map<String, Double> environment) {
        return this;
    }

    @Override
    public Expression simplify(Map<String, Double> environment) {
        return this;
    }

}
