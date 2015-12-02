package Week03.Monday;

/**
 * Created by inspired on 30.11.15.
 */
public class PowerFunction {
    public static <T1 extends Number> double powerFunc(T1 num, int power){
        double temp = num.doubleValue();
        for (int i = 2; i <= power; i++ ){
            temp *= num.doubleValue();
        }
        return temp;
    }

    public static void main(String[] args){
        System.out.println(powerFunc(2,2));
    }
}
