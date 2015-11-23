package week01;

/**
 * Created by inspired on 22.11.15.
 */
public class PalindromeScore {
    public static void main(String[] args){
        System.out.println(pScore(121));
        System.out.println(pScore(48));
    }

    public static int pScore(int n){
        int rev = 0;
        int num = n;
        int score = 1;
        return calculatePRecursively(num, score);
    }

    public static int calculatePRecursively(int num, int score){
        int rev = 0;
        int n = num;
        while(n > 0){
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println("rev: " + rev + "num " + num);
        if(rev == num){
            System.out.println("Score: " + score);
            return score;
        }
        score++;
        int p = rev + num;
        calculatePRecursively(p, score);
        return score;
    }

}
