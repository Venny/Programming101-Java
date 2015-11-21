package week01;

/**
 * Created by inspired on 20.11.15.
 */
public class ReverseEveryChar {
    public static void main(String[] args){
        String simpleStr = "What is this";
        System.out.println(reverseEveryChar(simpleStr));
    }

    public static String reverseEveryChar(String arg){
        String reversed = "";
        String[] reversedArr = arg.split(" ");
        for(int i = 0; i < reversedArr.length; i++){
            reversed += new StringBuffer(reversedArr[i]).reverse().toString() + " ";
        }
        return reversed.trim();
    }
}
