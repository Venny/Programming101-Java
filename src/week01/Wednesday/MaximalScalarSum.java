package week01.Wednesday;


import java.util.Arrays;

/**
 * Created by inspired on 20.11.15.
 */
public class MaximalScalarSum {
    public static void main(String[] args){
        int[] a = {1, 5, 7, 3};
        int[] b = {3, 16, 8, 2};
        System.out.println( maximalScalarSum(a, b));
    }

    public static long maximalScalarSum(int[] a, int[] b){
        if(a.length != b.length){
            System.err.println("Error. a.length is not equal to b.length.");
            return 0;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        long product = 0;
        for(int i = a.length - 1; i >= 0; i--){
            product += (a[i] * b[i]);
        }
        return product;
    }
}
