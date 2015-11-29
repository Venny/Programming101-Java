package week01.Friday;

/**
 * Created by inspired on 22.11.15.
 */
public class CountConsonants {
    public static void main(String[] args){
        System.out.println(countConsonants("Github is the second best thing that happend to programmers, after the keyboard!"));
    }

    public static int countConsonants(String str){
        String temp = str.toLowerCase().trim();
        String removeSymbols = temp.replaceAll("[^a-z]", "");
        String onlyConsonants = removeSymbols.replaceAll("[aeiouy]", "");
        System.out.println("Only consonants: " + onlyConsonants);
        return onlyConsonants.length();
    }

}
