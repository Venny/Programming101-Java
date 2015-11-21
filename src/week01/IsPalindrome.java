package week01;

/**
 * Created by inspired on 20.11.15.
 */
public class IsPalindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome("abcba"));
        System.out.println(isPalindrome("abca"));
        System.out.println(isPalindrome("abba"));
    }

    private static boolean isPalindrome(String argument){
        int length = argument.length();
        for (int i = 0; i < (length / 2); i++){
            //System.out.println(argument.charAt(i) + " " + argument.charAt(length - i - 1));
            if(argument.charAt(i) != argument.charAt(length - i - 1)){
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindrome(int num){
        int rev = 0;
        int n = num;
        while(n > 0){
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev == num;
    }
}
