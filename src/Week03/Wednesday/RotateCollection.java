package Week03.Wednesday;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by inspired on 06.12.15.
 */
public class RotateCollection {
    public static void main(String[] args){
        Collection<Integer> collection = new LinkedList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        rotate(collection, -2);
        System.out.println(collection.toString());
    }

    public static <T> void rotate(Collection<T> collection, int rotateStep ){
        T[] collectionArr = (T[]) collection.toArray();
        bubbleRotate(collectionArr, rotateStep);
        collection.clear();
        Collections.addAll(collection, collectionArr);
    }

    /* Bubble Rotate */
    private static <T> void bubbleRotate(T[] arr, int rotateStep){
        if (rotateStep < 0) {
            for(int i = rotateStep; i < 0; i++){
                for(int j = 0; j < arr.length - 1; j++){
                    T temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        } else {
            for(int i = 0; i < rotateStep; i++){
                for(int j = arr.length - 1; j > 0; j--){
                    T temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
