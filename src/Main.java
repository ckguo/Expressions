import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Expression number = new Number(3);
        Expression var = new Variable("x");
        Expression sum = number.add(var);
        System.out.println(sum);
        
        Map<String, Double> environment = new HashMap<String, Double>();
        environment.put("x", 2.0);
        Expression substitute = sum.substitute(environment);
        System.out.println(substitute);
        
        Expression eval = sum.evaluate();
        System.out.println(eval);
    }

}
