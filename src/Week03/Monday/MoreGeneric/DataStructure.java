package Week03.Monday.MoreGeneric;

/**
 * Created by inspired on 30.11.15.
 */
public interface DataStructure<E> {
    public void push(E data);
    public E pop();
    public E peek();
    public boolean isEmpty();
}
