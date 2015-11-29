package week01.Wednesday;

/**
 * Created by inspired on 20.11.15.
 */
public class CanBalance {
    public static void main(String[] args){
        int[] a = {1, 1, 1, 2, 1};
        int[] b = {2, 1, 1, 2, 1};
        System.out.println(canBalance(a));
        System.out.println(canBalance(b));
    }

    public static boolean canBalance(int[] numbers){
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        //System.out.println(sum);
        return sum % 2 == 0;
    }
}
