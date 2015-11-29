package week01.Wednesday;

/**
 * Created by inspired on 20.11.15.
 */
public class CountOccurrences {
    public static void main(String[] args){
        System.out.println(countOccurrences("da", "daaadaadada"));
    }

    public static int countOccurrences(String needle, String haystack){
        if(needle.length() > haystack.length()){
            System.err.println("The length of the needle string is longer than the haystack one.");
            return 0;
        }

        int occurrences = 0;
        for(int i = 0; i < haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(haystack.length() - i < needle.length()){
                    return occurrences;
                }

                for(int n = 0; n < needle.length(); n++){
                    if(haystack.charAt(i + n) != needle.charAt(n)){
                        break;
                    }
                }
                occurrences++;
            }
        }
        return occurrences;
    }
}
