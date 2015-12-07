package Week03.Wednesday;

import java.util.Arrays;
import java.util.Collection;
import java.util.DoubleSummaryStatistics;

/**
 * Created by inspired on 06.12.15.
 */
public class FirstUnique {
    public static void main(String[] args){
        Collection<Integer> ints = Arrays.asList(1,2,11,2,3,4,5,5,4,3,1);
        System.out.println(theFirstUnique(ints)); //2;
    }

    private static <T extends Number> String theFirstUnique(Collection<T> collection) {
        T[] collectionArr = (T[]) collection.toArray();
        int count = 0;

        for(int i = 0; i < collectionArr.length; i++){
            count = 0;
            for(int j = 0; j < collectionArr.length; j++){
                if(collectionArr[i].equals(collectionArr[j])){
                    System.out.println(collectionArr[i].equals(collectionArr[j]));
                    count++;
                    continue;
                }
            }
            if(count == 1){
                return collectionArr[i].toString();
            }
        }
        return "";
    }
}
