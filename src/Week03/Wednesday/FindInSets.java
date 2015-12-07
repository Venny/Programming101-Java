package Week03.Wednesday;

import java.util.*;

/**
 * Created by inspired on 06.12.15.
 */
public class FindInSets {
    public static void main(String[] args){
        Set<Integer> a = new HashSet(Arrays.asList(new Integer[]{1, 2, 3, 4, 5}));
        Set<Integer> b = new HashSet(Arrays.asList(new Integer[]{4,5,6}));
        Set<Integer> c = new HashSet(Arrays.asList(new Integer[]{5,6,7,8}));
        System.out.println(findDuplication(a, b, c).toString());
    }

    public static <E extends Number> Set<E> findDuplication(Set<E> a, Set<E> b, Set<E> c){
        Set<E> temp = findDublicated(a, b);
        if(!temp.isEmpty()){
            return findDublicated(temp, c);
        }
        return temp;
    }

    private static <E extends Number> Set<E> findDublicated(Set<E> a, Set<E> b){
        Set<E> temp = new HashSet<>();
        for (E first : a) {
            for (E  second: b) {
                if(first.equals(second)){
                    temp.add(first);
                }
            }
        }
        return temp;
    }
}
