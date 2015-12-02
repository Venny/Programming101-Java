package Week03.Monday;

/**
 * Created by inspired on 30.11.15.
 */
public class FactorialFunction {
    public static <T extends Number> double factorialOf(T num){
        double counter = num.doubleValue();
        double result = 1;
        while(counter > 0){
            result *= counter;
            counter --;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(factorialOf(5));
    }
}
