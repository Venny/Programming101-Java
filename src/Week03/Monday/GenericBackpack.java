package Week03.Monday;

/**
 * Created by inspired on 30.11.15.
 */
public class GenericBackpack <T> {
    private T simpleObject;

    public void set(T t){
        simpleObject = t;
    }

    public T get(){
        return simpleObject;
    }
}
