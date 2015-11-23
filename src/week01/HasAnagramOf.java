package week01;

/**
 * Created by inspired on 21.11.15.
 */
public class HasAnagramOf {
    public static void main(String[] args){
        System.out.println(hasAnagramOf("anagram", "acnagaram"));
    }

    public static boolean hasAnagramOf(String a, String b){
        a = a.trim();
        String bTemp = b.trim();
        char[] tempArr = bTemp.toCharArray();
        if(a.length() > bTemp.length()) return false;

        for(int i = 0; i < a.length(); i++){
            boolean equals = false;
            for(int n = 0; n < bTemp.length(); n++){
                if(a.charAt(i) == tempArr[n]){
                    tempArr[n] = '.';
                    equals = true;
                    break;
                }
            }
            if(!equals){
                return false;
            }
        }

        return true;
    }
}
