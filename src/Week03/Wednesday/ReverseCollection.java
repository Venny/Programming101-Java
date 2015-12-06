package Week03.Wednesday;

import java.util.*;

/**
 * Created by inspired on 02.12.15.
 */
public class ReverseCollection {
    public static void main(String[] args){
        Collection<Integer> collection = new LinkedList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);

        reverse(collection);
        System.out.println("The reversed collection: " + collection.toString());
    }

    public static <T> void  reverse(Collection<T> collection){
        Object[] temp = collection.toArray();
        int length = temp.length;
        Object[] reversed = new Object[3];
        for(int i = 0; i < length; i++){
            reversed[i] = temp[length - 1 - i];
        }
        collection.clear();
        Collections.addAll(collection, (T[]) reversed);
    }
}
