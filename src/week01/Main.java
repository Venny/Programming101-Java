package week01;

/**
 * Created by inspired on 16.11.15.
 */
public class Main {
    public static void main(String[] args){
        int[] temp = {2, 4, 5, 8, 1};
        //System.out.println(isPrime(5));
        //System.out.println(kthMin(3, temp));
        //System.out.println(getAverage(temp));
        System.out.println(doubleFac(3));
        System.out.println(kthFac(2, 3));
    }

    /* odd number */
    public static boolean isOdd(int num){
        return num % 2 == 0;
    }

    /* prime number */
    public static boolean isPrime(int n){
        for(int i = 2; i < n; i++){
            if( n % i == 0) {
                return false;
            }
        }

        return true;
    }

    /* minimum element of an array */
    public static int min(int[] array){
        int smallest = array[0];
         for ( int i = 1; i < array.length; i++){
             if (smallest > array[i]){
                 smallest = array[i];
             }
         }

        return smallest;
    }

    /* kth minimal element of an array */
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

    /* the average of the elements of an array */
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


}
