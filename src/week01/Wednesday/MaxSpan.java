package week01.Wednesday;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * Created by inspired on 20.11.15.
 */
public class MaxSpan {
    public static void main(String[] args){
        int[] a = {1, 4, 2, 1, 4, 1, 4};
        int[] b = {1, 2, 1, 1, 3};
        System.out.println(maxSpan(b));
    }

    public static int maxSpan(int[] numbers){
        int maxSpan = 0;
        for(int i = 0; i < numbers.length; i++){
            int span = 1;
            for(int n = numbers.length - 1; n >= 0; n--){
                if(numbers[i] == numbers[n]){
                    span = n - i + 1;
                    break;
                }
            }
            if(span > maxSpan){
                maxSpan = span;
            }
        }

        return maxSpan;
    }
}
