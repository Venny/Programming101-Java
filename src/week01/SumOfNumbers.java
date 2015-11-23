package week01;

/**
 * Created by inspired on 21.11.15.
 */
public class SumOfNumbers {
    public static void main(String[] args){
        System.out.println(sumOfNumbers("abc123dd34"));
    }

    public static int sumOfNumbers(String input) {
        String temp = input.replaceAll("[^-?0-9]+", " ");
        String[] numsArr = temp.trim().split(" ");
        int result = 0;
        for(String num:numsArr){
            result += Integer.parseInt(num);
        }
        return result;
    }

}
