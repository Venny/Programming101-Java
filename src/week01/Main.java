package week01;

import java.util.Arrays;

/**
 * Created by inspired on 16.11.15.   From 1st task to 12th
 */
public class Main {
    public static void main(String[] args){
        int[] temp = {2, 4, 5, 8, 1};
        //System.out.println(isPrime(5));
        //System.out.println(kthMin(3, temp));
        //System.out.println(getAverage(temp));
        //System.out.println(doubleFac(3));
        //System.out.println(kthFac(2, 3));
        //System.out.println(getLargestPalindrome(265765));
        //System.out.println("a" == "a");
        //Greyscale.histogram();
        int[] tempArr = {1,2,2,1,3,4,3,4,4,6,5,6,5};
        System.out.println(getOddOccurrence(tempArr));
    }

    /* Odd number */
    public static boolean isOdd(int num){
        return num % 2 == 0;
    }

    /* Prime number */
    public static boolean isPrime(int n){
        for(int i = 2; i < n; i++){
            if( n % i == 0) {
                return false;
            }
        }

        return true;
    }

    /* Minimum element of an array */
    public static int min(int[] array){
        int smallest = array[0];
         for ( int i = 1; i < array.length; i++){
             if (smallest > array[i]){
                 smallest = array[i];
             }
         }

        return smallest;
    }

    /* Kth minimal element of an array */
    public static int kthMin(int k, int[] array){
        int currentMin = 0;
        int[] tempArr = array.clone();

        for(int i = 0; i < tempArr.length; i++){
            for(int n = i; n < tempArr.length; n++){
                if(tempArr[currentMin] > tempArr[n]){
                    currentMin = n;
                }
            }
            int temp = tempArr[i];
            tempArr[i] = tempArr[currentMin];
            tempArr[currentMin] = temp;
            if( i == k - 1 ){
                return tempArr[i];
            }
        }
        System.err.println("There is an error.");
        return 0;
    }

    /* The average of the elements of an array */
    public static int getAverage(int[] array){
        int averageNum = 0;

        for(int num:array){
            averageNum += num;
        }
        return averageNum/array.length;
    }

    /* Double factorial */
    public static long doubleFac(int n){
        return factorial( factorial(n) );
    }

    private static long factorial(long n){
        long result = 1;
        for(long i = 1; i <= n; i++){
           result *= i;
        }
        return result;
    }

    /* Kth factorial */
    public static long kthFac(int k, long n){
        long result = 1;
        for(int t = 1; t <= k; t++){
            result = 1;
            for(int i = 1; i <= n; i++){
                result *= i;
            }
            n = result;
        }
        return result;
    }

    /* Smallest multiple */
    public static long getSmallestMultiple(int upperBound){
        return factorial(upperBound);
    }

    /* The largest integer palindrome */
    public static long getLargestPalindrome(long n){
        for(long i = n - 1; i > 0; i--){
            if(isPalindrome(i)) return i;
        }
        return 0;
    }

    private static boolean isPalindrome(long num){
        long rev = 0;
        long n = num;
        while(n > 0){
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev == num;
    }

    public static void arrList(int[] arr, int index){
        int temp = 0;
        for(int i:arr){
            if(i != index){
                temp *= arr[i];
            }
        }
        System.out.println(temp);
    }

    /* Raise an integer to a power of another O(log(b)) */
    public static long pow(int a, int b){
        long num = 1;
        while(num < a){
            num *= b;
        }
        return num;
    }

    public static int getOddOccurrence(int[] arr){

        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        for(int i:arr){
            int tempTimes = 0;
            for(int n:arr ){
                if(arr[i] == arr[n]) {
                    tempTimes++;
                }
            }
            if(tempTimes % 2 != 0){
                return arr[i];
            }
        }
        return 0;
    }


}
