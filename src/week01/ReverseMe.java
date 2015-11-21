package week01;

/**
 * Created by inspired on 20.11.15.
 */
public class ReverseMe {
    public static void main(String[] args){
        String simpleStr = "daaadaadada";
        System.out.println(reverseMe(simpleStr));
    }

    public static String reverseMe(String argument) {
        String reversed = "";
        for(int i = argument.length() - 1; i >= 0; i--){
            reversed += argument.charAt(i);
        }
        return reversed;
    }
}
