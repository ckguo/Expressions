import java.util.Map;


public class Variable implements Expression {
    private String var;

    /**
     * Constructs a variable with name equal to the input string
     * @param input string
     */
    public Variable(String input) {
        this.var = input;
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
        if (environment.get(this.var) != null) {
            return new Number(environment.get(this.var));
        }
        else {
            return this;
        }
    }

    @Override
    public Expression simplify(Map<String, Double> environment) {
        // TODO Auto-generated method stub
        return null;
    }

}
