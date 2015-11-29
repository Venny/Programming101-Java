package week01.Friday;

/**
 * Created by inspired on 21.11.15.
 */
public class HackNumbers {
    public static void main(String[] args){
        System.out.println(isHack(5));
        System.out.println(nextHack(5));
    }

    public static boolean isHack(int n){
        String binary = Integer.toBinaryString(n);
        return isPalindrome(binary);
    }

    public static int nextHack(int n){
        int num = n + 1;

        while(true){
            if(isHack(num)){
                return num;
            }
            num++;
        }

    }

    private static boolean isPalindrome(String argument){
        int length = argument.length();
        for (int i = 0; i < (length / 2); i++){
            if(argument.charAt(i) != argument.charAt(length - i - 1)){
                return false;
            }
        }
        return true;
    }
}
