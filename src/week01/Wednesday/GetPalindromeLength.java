package week01.Wednesday;

/**
 * Created by inspired on 20.11.15.
 */
public class GetPalindromeLength {
    public static void main(String[] args){
        System.out.println(getPalindromeLength("adaz*zadfgdfg"));
    }

    public static int getPalindromeLength(String input){
        int inputLength = input.length();
        int palindromeLength = 0;
        for (int i = 0; i <inputLength; i++){
            if(input.charAt(i) == '*'){
                for (int n = 1; n < inputLength / 2; n++){
                    if(input.charAt(i + n) == input.charAt(i - n)){
                        palindromeLength ++;
                    } else {
                        return palindromeLength;
                    }
                }
            }
        }
        return palindromeLength;
    }
}
