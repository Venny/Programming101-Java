package week01.Wednesday;

import java.io.UnsupportedEncodingException;

/**
 * Created by inspired on 20.11.15.
 */
public class DecodeUrl {
    public static void main(String[] args){
        System.out.println(decodeUrl("kitten%20pic.jpg"));
        System.out.println(decodeUrl("%20=>' ' %3A=>':' %3D=>'?' %2F=>'/"));
    }

    public static  String decodeUrl(String input){
        try {
            return java.net.URLDecoder.decode(input, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.err.println("Error.");
        return "";
    }

}
