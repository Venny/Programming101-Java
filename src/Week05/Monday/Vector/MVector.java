package Week05.Monday.Vector;

import java.util.Collection;
import java.util.Vector;

/**
 * Created by inspired on 03.01.16.
 */
public class MVector<E> {
    private Vector<Object> vector;

    public MVector(Collection<?> coordinates){
        vector = new Vector<>();
        vector.addAll(coordinates);
    }

    public MVector(MVector<E> coordinates){

    }
}
