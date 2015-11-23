package week01;

/**
 * Created by inspired on 21.11.15.
 */
public class CountVowels {
    public static void main(String[] args){
        System.out.println(countVowels("Theistareykjarbunga") );
    }

    public static int countVowels(String str){
        String temp = str.toLowerCase();
        int vowelsNum = 0;
        for(int i = 0; i < str.length(); i++){
            if(isVowel(str.charAt(i))){
                vowelsNum++;
            }
        }
        return vowelsNum;
    }

    private static boolean isVowel(char a){
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};

        for(char item:vowels){
            if(item == a) return true;
        }
        return false;
    }
}
