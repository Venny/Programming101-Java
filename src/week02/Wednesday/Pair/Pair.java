package week02.Wednesday.Pair;

/**
 * Created by inspired on 30.11.15.
 */
public class Pair {
    private final Object item1;
    private final Object item2;

    public Pair(Object item1, Object item2 ){
        this.item1 = item1;
        this.item2 = item2;
    }

    public Object getItem1(){
        return item1;
    }

    public Object getItem2(){
        return item2;
    }
}
