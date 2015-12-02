package Week03.Monday;

/**
 * Created by inspired on 30.11.15.
 */
public class DivisionFunction {
    public  static <T1 extends Number, T2 extends Number> double sumThem(T1 num1, T2 num2){
        return num1.doubleValue() / num2.doubleValue();
    }
}
