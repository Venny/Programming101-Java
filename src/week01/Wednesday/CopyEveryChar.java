package week01.Wednesday;

/**
 * Created by inspired on 20.11.15.
 */
public class CopyEveryChar {
    public static void main(String[] args){
        System.out.println(copyEveryChar("tldr", 3));
    }

    public static String copyEveryChar(String input, int k){
        String extended = "";
        for(int i = 0; i < input.length(); i++){
            for (int n = 0; n < k; n++){
                extended += input.charAt(i);
            }
        }
        return extended;
    }
}
